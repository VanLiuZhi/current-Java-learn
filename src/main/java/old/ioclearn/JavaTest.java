package old.ioclearn;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

class Parents {
    public String die;

    private String laji;

    public void test() {

    }

    public void test3() {

    }

    private void test2() {

    }

    Parents() {
        this.die = "die";
    }
}

public class JavaTest extends Parents {

    public String die;

    private String laji;

    public void test() {

    }

    private void test2() {

    }

    public static void main(String[] args) {
        try {
            Class<?> cls = null;
            cls = Class.forName("java.lang.Stri211ng");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

}
