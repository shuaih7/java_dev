package thread;
import general.Method;

public class RunnableTest implements Runnable{
    @Override
    public void run(){
        for (int i=0; i<100; i++){
            Method.print("另一个线程 "+i);
        }
    }

    public static void main(String[] args) {
        RunnableTest runTest = new RunnableTest();
        Thread newThread = new Thread(runTest);
        newThread.start();

        for (int j=0; j<1000; j++){
            Method.print(j);
        }
    }
}
