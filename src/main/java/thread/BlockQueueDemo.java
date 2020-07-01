package thread;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-04-06 10:35
 */
public class BlockQueueDemo {
    private int queueSize = 10;
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(queueSize);

    public static void main(String[] args) {
        BlockQueueDemo blockQueueDemo = new BlockQueueDemo();
        Consumer consumer = blockQueueDemo.new Consumer();
        Producer producer = blockQueueDemo.new Producer();
        producer.start();
        consumer.start();

    }

    class Consumer extends Thread {
        @Override
        public void run() {
            consumer();
        }

        private void consumer() {
            while (true) {
                try {
                    queue.take();
                    System.out.println("从队列获取值，队列剩余：" + queue.size() + "个元素");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Producer extends Thread {
        @Override
        public void run() {
            prodecer();
        }

        private void prodecer() {
            while (true) {
                try {
                    queue.put(1);
                    System.out.println("向队列插入一个元素，队列剩余" + (queueSize - queue.size()) + "个元素");
                } catch (NullPointerException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
