package thread;

/*
* Thread 中的 join 方法在调用时会让主线程阻塞并等待该线程执行完毕
* 并不会影响其他子线程的运行
* */

public class JoinTest implements Runnable{
    private String name = "";

    public JoinTest(){};

    public JoinTest(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(this.name+"线程来了-"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable jointest = new JoinTest("VIP");
        Runnable jointest1 = new JoinTest("一般");
        Thread thread = new Thread(jointest,"vip");
        Thread thread1 = new Thread(jointest1,"normal");
        thread1.setDaemon(true); // 设置守护线程
        thread.start();
        thread1.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("主线程执行-"+i);
            if (i==50){
                thread.join();
            }
        }
    }
}
