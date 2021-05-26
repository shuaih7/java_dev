package thread;

public class SyncTest{
    private int tickets = 100;

    public static void main(String[] args) {
        SyncTest sync = new SyncTest();

        Runnable r1 = new SingleRunnable(sync);
        Runnable r2 = new SingleRunnable(sync);
        Runnable r3 = new SingleRunnable(sync);
        Thread t1 = new Thread(r1,"第一个人");
        Thread t2 = new Thread(r2,"第二个人");
        Thread t3 = new Thread(r3,"第三个人");
        t1.start();
        t2.start();
        t3.start();
    }

    // synchronized 关键字相当于索了整个this对象
    // synchronized 修饰的必须为类，并且该类不能够作为局部变量
    public void buyTickets(){
        this.tickets -= 1;
        System.out.println("票数还剩下"+this.tickets+"张.");
    }

    public int getTickets(){
        return this.tickets;
    }
}

class SingleRunnable implements Runnable{
    private SyncTest sync = null;

    public SingleRunnable(SyncTest synctest){
        sync = synctest;
    }

    @Override
    public void run(){
        synchronized (sync) {
            while (this.sync.getTickets() > 0) {
                this.sync.buyTickets();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /*
    @Override
    public void run(){
        while(this.sync.getTickets()>0){
            this.sync.buyTickets();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }*/
}