package old.new_syntax;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-01-19 15:47
 */
public class LambdaTest {
    @FunctionalInterface
    interface Hello {
        void sayHello();
    }

    public void show(Hello hello) {
        hello.sayHello();
    }

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.show(() -> System.out.println("123"));

        String a = "abc";
        String b = "abc";
        System.out.println(a == b);

    }
}
