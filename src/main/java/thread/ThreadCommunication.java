package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-03-30 16:34
 */
public class ThreadCommunication {
    final Lock lock = new ReentrantLock();
    //定义2组condition 对应生产者消费者
    final Condition notFull  = lock.newCondition();

    final Condition notEmpty = lock.newCondition();

    final Object[] items = new Object[100];
    int putptr, takeptr, count;
    //在put的时候 当数组已经满了的情况下 我让线程等待 不在容纳数据 当消费者已经消费了 触发了、、

    //notfull.signal() 这时候通知生产者 我这变已经消费了 你那边可以试试了哈。
    public void put(Object x) throws InterruptedException {
        lock.lock();
        try {
            while (count == items.length)
                notFull.await();
            items[putptr] = x;
            if (++putptr == items.length) putptr = 0;
            ++count;
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }
    //同上 相反的理解就是了。。。
    public Object take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0)
                notEmpty.await();
            Object x = items[takeptr];
            if (++takeptr == items.length) takeptr = 0;
            --count;
            notFull.signal();
            return x;
        } finally {
            lock.unlock();
        }
    }
}
