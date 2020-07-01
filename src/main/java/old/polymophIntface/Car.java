package old.polymophIntface;

public abstract interface Car {
    void getName();

    Integer getPrice();

    static String hello() {
        return "hello";
    }

    default void stu() {
        System.out.println("stu");
    }

    Integer getAge();
}
