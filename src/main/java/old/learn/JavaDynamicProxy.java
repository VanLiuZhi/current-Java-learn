package old.learn;

import java.lang.reflect.Proxy;

interface Developer {
    void code();

    void debug();
}

class JavaDeveloper implements Developer {
    private String name;

    JavaDeveloper(String name) {
        this.name = name;
    }

    @Override
    public void code() {

    }

    @Override
    public void debug() {

    }
}

public class JavaDynamicProxy {
    public static void main(String[] args) {
        JavaDeveloper zack = new JavaDeveloper("Zack");

        Developer zackProxy = (Developer) Proxy.newProxyInstance(zack.getClass().getClassLoader(),
                zack.getClass().getInterfaces(), ((proxy, method, args1) -> {
                    if (method.getName().equals("code")) {
                        return method.invoke(zack, args);
                    }
                    return null;
                }));
    }
}
