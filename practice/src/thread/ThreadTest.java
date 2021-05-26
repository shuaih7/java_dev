package thread;

import general.Method;

public class ThreadTest extends Thread{
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();

        for (int i=0; i<1000; i++){
            Method.print(i);
        }
    }

    @Override
    public void run(){
        for (int i=0; i<100; i++){
            Method.print("线程"+Integer.toString(i));
        }
    }
}
