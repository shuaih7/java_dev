package thread;

/*
* 线程共分为5个状态：启动，就绪，运行，阻塞，完成
* yield 关键关键字不会阻塞线程，会让线程进入就绪状态
* 并且礼让，但是礼让不一定会成功
* 礼让最终成功与否取决于 CPU 内核态
* */

public class YieldTest implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"已经就绪...");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程结束.");
    }

    public static void main(String[] args) {
        Runnable r1 = new YieldTest();
        Runnable r2 = new YieldTest();
        Thread t1 = new Thread(r1,"Thread1");
        Thread t2 = new Thread(r2,"Thread2");

        t1.start();
        t2.start();
    }
}
