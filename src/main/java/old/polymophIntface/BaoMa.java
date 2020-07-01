package old.polymophIntface;

public class BaoMa implements Car {

    private String name;
    private Integer price;

    BaoMa() {
        this.name = "";
        this.price = 0;
    }

    @Override
    public void getName() {

    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public Integer getAge() {
        return null;
    }

    public static void main(String[] args) {
        BaoMa baoMa = new BaoMa();
        baoMa.stu();

    }
}
