package thread;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-03-30 16:47
 */
public class NotifyTest {

    public void go() throws InterruptedException {
        final Thread hello = new Thread() {
            @Override
            public void run() {
                try{
                    Thread.sleep(1000 * 10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // wait();
                System.out.println("hello");
            }
        };
        final Thread sleepThread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                super.run();
            }
        };
        hello.start();
        Thread.sleep(3 * 1000);
        notifyAll();
    }

    public static void main(String[] args) throws InterruptedException {
        NotifyTest notifyTest = new NotifyTest();
        notifyTest.go();
    }
}
