package old.interior;

public class Interior {

    private Integer a = 20;

    Test test;

    Interior(Integer a) {
        this.a = a;
    }

    static class Test {
        public void func1() {
            System.out.println("123");
        }
    }

    public void func() {
        Test test = new Test();
        test.func1();
    }


    public static void main(String[] args) {
        Interior integer = new Interior(20);
        Test test = new Test();
    }
}
