package general;

public class Method {
    static private int number = 2;
    static private int static_number;

    public static void main(String[] args) {
        Method nMethod = new Method();
        int total = nMethod.addNum(number, static_number);
        System.out.println(total);

    }

    public int addNum(int a, int b){
        return a + b;
    }
}
