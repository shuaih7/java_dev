package staticProxy;

public class BuyCarProxy implements BuyCar{
    private BuyCar newCarReq = null;

    public BuyCarProxy(final BuyCar buycar){
        this.newCarReq = buycar;
    }

    @Override
    public void buycar(){
        newCarReq.buycar();
        System.out.println("要买什么车呢？");
        System.out.println("那就本田飞度GK5吧！");
    }
}
