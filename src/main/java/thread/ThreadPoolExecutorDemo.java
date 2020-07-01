package thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-04-05 21:39
 */
public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        // new ThreadPoolExecutor()
        SecurityManager securityManager = System.getSecurityManager();
        System.out.println(securityManager.getThreadGroup());
    }

}

class ThreadFactoryDefault implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        return null;
    }
}

