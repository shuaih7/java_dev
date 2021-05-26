package staticProxy;

public interface BuyCar {
    public void buycar();

    // Java 接口中的静态方法不需要去重写
    // Java 接口中的静态方法也不能够被Super直接调用
    // public static void hello(){
    //     System.out.print("Hello");
    // }
}
