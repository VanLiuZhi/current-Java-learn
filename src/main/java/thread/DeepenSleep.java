package thread;

/**
 * @Description sleep是否会释放锁
 * @Author VanLiuZhi
 * @Date 2020-03-24 23:48
 */

public class DeepenSleep implements Runnable {
    private int number = 10;

    public void firstMethod() throws Exception {
       {
            System.out.println("in first method");
            number += 100;
            System.out.println("+100=" + number);
        }
    }

    public void secondMethod() throws Exception {
          {
            System.out.println("in second method, prepare sleep");
            /**
             * (休息2S,阻塞线程) 以验证当前线程对象的机锁被占用时, 是否被可以访问其他同步代码块
             */
            // Thread.sleep(2000);
            System.out.println("wake up!!");
            // this.wait(2000);
            number *= 200;
            System.out.println("*200=" + number);
        }
    }
    @Override
    public void run() {
        try {
            System.out.println("run thread...");
            firstMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        DeepenSleep dt = new DeepenSleep();
        Thread thread = new Thread(dt);
        thread.start();
        Thread.sleep(3000);
        System.out.println("prepare run second method");
        dt.secondMethod();
    }
}

