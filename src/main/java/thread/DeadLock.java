package thread;

import java.util.concurrent.*;

/**
 * @Description 死锁
 * @Author VanLiuZhi
 * @Date 2020-03-25 00:13
 */
public class DeadLock {

    private static String resource_a = "A";
    private static String resource_b = "B";

    public static void main(String[] args) {
        deadLock();
    }

    public static void deadLock() {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource_a) {
                    System.out.println("A get resource a" + Thread.currentThread().getId());
                    try {
                        // Thread.sleep(3000);
                        synchronized (resource_b) {
                            System.out.println("A get resource b" + Thread.currentThread().getId());
                        }
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource_b) {
                    System.out.println("B get resource b" + Thread.currentThread().getId());
                    synchronized (resource_a) {
                        System.out.println("B get resource a" + Thread.currentThread().getId());
                    }
                }
            }
        });
        threadA.start();
        threadB.start();

    }
}

