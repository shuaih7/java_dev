package general;
import java.awt.*;
import java.util.Arrays;

public class Method {

    public static void main(String[] args) {
        Frame frame = new Frame("MainWindow");

    }

    public static void print(String s){
        System.out.println(s);
    }

    public static void print(int i) {System.out.println(i);}

    public static void printArray(Arrays arr){
        System.out.println(arr);
    }

    public int addNum(int a, int b){
        return a + b;
    }
}
