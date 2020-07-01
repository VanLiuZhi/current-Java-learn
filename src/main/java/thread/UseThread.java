package thread;

import java.util.concurrent.*;

/**
 * @Description 多线程创建
 * @Author VanLiuZhi
 * @Date 2020-03-30 14:22
 */
public class UseThread {
}

// 实现runnable接口
class ThreadA implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread ID === " + Thread.currentThread().getId());
    }

    static {
        System.out.println("Main Thread ID === " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadA());
        thread.start();
    }
}

// 继承Thread类
class ThreadB extends Thread {

    @Override
    public void run() {
        System.out.println("Thread ID === " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        ThreadB threadB = new ThreadB();
        threadB.start();
        System.out.println(Thread.currentThread().getId());
    }
}

// 实现callable接口(callable可以有返回值，支持泛型，这两点是和Runnable的区别)，使用Future来获取结果
class Demo3 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(new Callable() {
            @Override
            public String call() throws Exception {
                System.out.println(Thread.currentThread());
                return "通过实现Callable接口";
            }
        });
        try {
            String result = future.get(); // get 方法会阻塞当前线程知道得到结果，可以使用带超时参数的get
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}


// 使用FutureTask来获取结果
class Task implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        //
        Thread.sleep(1000);
        return 2;
    }

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        //
        ExecutorService executor = Executors.newCachedThreadPool();
        FutureTask<Integer> futureTask = new FutureTask<>(new Task());
        executor.submit(futureTask);
        System.out.println(futureTask.get());
    }
}

// 线程组，不指定默认是main线程的线程组，线程组就是可以对同一组线程批量控制
class ThreadGroupTest {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("myThreadGroup");
        Thread hello = new Thread(threadGroup, () -> {
            System.out.println("hello");
            System.out.println("hello thread group: " + Thread.currentThread().getThreadGroup());
            System.out.println("hello thread name: " + Thread.currentThread().getName());
        }, "my thread name is hello");
        hello.start();
        System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println(Thread.currentThread().getName());
    }
}

// 线程优先级，java默认优先级是5，范围1到10，某些操作系统不提供这么多的优先级，具体看JVM的实现
// 即使设置优先级，也不绝对保证执行顺序，优先级更高能更容易抢到cpu，java的线程调度是抢占式的，守护线程优先级低于

// 可以通过线程组来指定该组内的线程优先级，并且其中的线程优先级显示设置超过组的设置，会变成组的优先级默认低于普通线程
// ThreadGroup threadGroup = new ThreadGroup("t1");
// threadGroup.setMaxPriority(6);
class ThreadLevel {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("myThreadGroup");
        Thread hello = new Thread(threadGroup, () -> {
            System.out.println("hello");
            System.out.println("hello thread group: " + Thread.currentThread().getThreadGroup());
            System.out.println("hello thread name: " + Thread.currentThread().getName());
        }, "my thread name is hello");
        hello.start();
        hello.setPriority(8); // hello线程不一定最先执行，当然这个例子不明显
        System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println(Thread.currentThread().getName());
    }
}

//
