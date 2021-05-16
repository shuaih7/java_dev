package thread;

public class PriorityTest implements Runnable{
    private String name = "";

    public PriorityTest(){};
    public PriorityTest(String name){
        this.name = name;
    };

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"->"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Runnable r1 = new PriorityTest("r1");
        Runnable r2 = new PriorityTest("r2");
        Runnable r3 = new PriorityTest("r3");
        Runnable r4 = new PriorityTest("r4");
        Thread t1 = new Thread(r1,"t1");
        Thread t2 = new Thread(r2,"t2");
        Thread t3 = new Thread(r3,"t3");
        Thread t4 = new Thread(r4,"t4");

        // 先设置优先级，再执行线程
        // 优先级默认值为5，最大值为10，最小值为1
        // 修改优先级会改变线程调度顺序的权重，并不一定保证优先级大的先执行
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(6);
        t3.setPriority(3);
        t4.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
