package staticProxy;

public class BuyCarTest {
    public static void main(String[] args) {
        /*
         * 静态代理模式的本质就相当于
         * 给实现接口的类加了一个装饰器
         */
        // BuyCarImpl buynewcar = new BuyCarImpl(); // 置界调用实现类
        BuyCar buynewcar = ()->{System.out.println("我要买车啦!");}; //使用lambda函数式接口->接口中只有一个抽象方法
        System.out.println("===== 直接输出 =====");
        buynewcar.buycar();

        System.out.println("=== 使用代理输出 ===");
        BuyCarProxy buynewcarproxy = new BuyCarProxy(buynewcar);
        buynewcarproxy.buycar();
    }
}
