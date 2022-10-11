package utilpattern.thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * 第一步: 首先线程0和1, 获取锁. 线程3被被阻塞
 * 第二步: 3秒过后, 线程0和线程1分别释放锁
 * 第三步: 线程2可以获得到锁
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                try {
                    // 默认使用一个许可.R
                    sem.acquire();
                    System.out.println(Thread.currentThread() + " I get it.");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(Thread.currentThread() + " I release it.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    sem.release();
                }
            }).start();
        }

    }
}
