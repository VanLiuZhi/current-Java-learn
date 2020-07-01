package old.polymophIntface;

public class CarShop {

    private Integer money = 0;

    public void statisticsPrice(Car car) {
        money += car.getPrice();
        System.out.println(money);
    }

    public static void main(String[] args) {
        CarShop carShop = new CarShop();
//        BaoMa baoMa = new BaoMa("bao ma", 20);
//        carShop.statisticsPrice(baoMa);
    }
}
