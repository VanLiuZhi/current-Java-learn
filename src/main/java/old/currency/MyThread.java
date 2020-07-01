package old.currency;

public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("run method");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
        System.out.println("线程唯一标识符：" + thread.getId());
        System.out.println("线程名称：" + thread.getName());
        System.out.println("线程状态：" + thread.getState());
        System.out.println("线程优先级：" + thread.getPriority());
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("run myThread2");
    }

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}

final class SetCheck implements Runnable {
    private int a = 0;
    private long b = 0;

    void set() {
        a = 1;
        b = -1;
    }

    boolean check() {
        return ((b == 0) || (b == -1 && a == 1));
    }

    @Override
    public void run() {

        System.out.println(check());
        set();
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            Thread thread = new Thread(new SetCheck());
            thread.start();
        }
    }


}
