package thread;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-03-30 17:03
 */
public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        //sleepThread睡眠1000ms
        final Thread sleepThread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000 * 5);
                    System.out.println("end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                super.run();
            }
        };
        //busyThread一直执行死循环
        Thread busyThread = new Thread() {
            @Override
            public void run() {
                while (true) {

                }
            }
        };
        sleepThread.start();
        busyThread.start();
        sleepThread.join();
        Thread.sleep(1000 * 2);
        sleepThread.interrupt();
        Thread.interrupted();
        // 标志位重新置位的时候，会再次进入循环体
        while (sleepThread.isInterrupted()) {
            System.out.println("sleepThread isInterrupted: " + sleepThread.isInterrupted());
            System.out.println("busyThread isInterrupted: " + busyThread.isInterrupted());
        }
        //interrupt 中断该线程，如果该线程调用了wait,sleep,join方法被中断，抛出异常后，中断标志位变为false  看 sleepThread
        // busyThread 被中断，标志位置位
        // 线程中断，后面的代码不会执行 看 sleepThread
    }
}
