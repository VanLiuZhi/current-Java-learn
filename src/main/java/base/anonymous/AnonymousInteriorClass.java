package base.anonymous;

/**
 * @Description 匿名内部类
 * @Author VanLiuZhi
 * @Date 2020-03-30 14:36
 */
public class AnonymousInteriorClass {

    private String name;

    void demo1() {
        MessageImpl message = new MessageImpl();
        message.send("hello");
    }

    void demo2() {
        // 使用匿名内部类的时候，有一个前提：必须要基于接口或抽象类的应用
        Message message = new Message() {
            @Override
            public void send(String msg) {

                System.out.println(msg);
            }
        };
        message.send("aex");
    }

    public static void main(String[] args) {
        AnonymousInteriorClass anonymousInteriorClass = new AnonymousInteriorClass();
        anonymousInteriorClass.demo1();
        anonymousInteriorClass.demo2();
    }
}

interface Message {
    void send(String msg);
}

class MessageImpl implements Message {

    @Override
    public void send(String msg) {
        System.out.println(msg);
    }
}


