package old.interior;

public class B {
    int i = 1;
    int j = 1;
    static int s = 1;
    static int ss = 1;
    A a;
    AA aa;
    AAA aaa;
    //内部类A

    public class A {
        //        static void go () {
//
//        }
//        static {
//
//        }
//      static int b = 1;//非静态内部类不能有静态成员变量和静态代码块和静态方法，
        // 因为内部类在外部类加载时并不会被加载和初始化。
        //所以不会进行静态代码的调用
        int i = 2;//外部类无法读取内部类的成员，而内部类可以直接访问外部类成员

        public void test() {
            System.out.println(j);
            j = 2;
            System.out.println(j);
            System.out.println(s);//可以访问类的静态成员变量
        }

        public void test2() {
            AA aa = new AA();
            AAA aaa = new AAA();
        }

    }

    //静态内部类S，可以被外部访问
    public static class S {
        int i = 1;//访问不到非静态变量。
        static int s = 0;//可以有静态变量

        public static void main(String[] args) {
            System.out.println(s);
        }

        public void test() {
//            System.out.println(j);//报错，静态内部类不能读取外部类的非静态变量
            System.out.println(s);
            System.out.println(ss);
            s = 2;
            ss = 2;
            System.out.println(s);
            System.out.println(ss);
        }
    }

    //内部类AA，其实这里加protected相当于default
    //因为外部类要调用内部类只能通过B。并且无法直接继承AA，所以必须在同包
    //的类中才能调用到(这里不考虑静态内部类)，那么就和default一样了。
    protected class AA {
        int i = 2;//内部类之间不共享变量

        public void test() {
            A a = new A();
            AAA aaa = new AAA();
            //内部类之间可以互相访问。
        }
    }

    //包外部依然无法访问，因为包没有继承关系，所以找不到这个类
    protected static class SS {
        int i = 2;//内部类之间不共享变量

        public void test() {

            //内部类之间可以互相访问。
        }
    }

    //私有内部类A，对外不可见，但对内部类和父类可见
    private class AAA {
        int i = 2;//内部类之间不共享变量

        public void test() {
            A a = new A();
            AA aa = new AA();
            //内部类之间可以互相访问。
        }
    }

    public void test() {
        A a = new A();
        a.test();
        //内部类可以修改外部类的成员变量
        //打印出 1 2
        B b = new B();

    }
}
