package old.polymoph;

public class Children implements Parents {

    public String name = "123";
    public String name1 = "mnb";

    @Override
    public void func1() {
        System.out.println("children func1");
    }

    @Override
    public void parentsFunc1() {

    }

    public void func2() {
        System.out.println("children func2");
    }

    public static void main(String[] args) {
        /**
         * 多态 方法
         * 1. 对于方法，只能调用父类中定义的，如果这个方法子类重写了，实际执行使用子类的，如func1
         * 2. 如果方法子类没有，调用父类的，如parentsFunc1
         * 3. 不能调用只有子类才有的方法，如func2
         *
         * 多态 属性
         * 1. 属性则不会这样，只能调用父类的属性，name属性子父类都有，使用父类的
         * 2. 子类才有的属性，父类无法调用，如name1
         */
        Parents children = new Children();
        children.func1(); // children func1
        children.parentsFunc1(); // parents parentsFunc1
        // children.func2(); 无法调用
        System.out.println(children.name); // 123456
        // System.out.println(children.name1); 无法调用
//        children.supperFunc();
        // Parents 继承类 SupperParents 的方法，情况参照 2，你就把supperFunc当成是 Parents 类的方法，
        // 因为supperFunc是Parents通过继承得到的

        /**
         * 使用对象自身的引用的情况就简单多了，自己有的属性和方法就调用自己的，否则看父类有没有
         */
        Children children1 = new Children();
        children1.func1(); // children func1
        children1.parentsFunc1(); // parents parentsFunc1
        children1.func2(); // children func2
//        children1.supperFunc(); // Parents 继承类的方法
        System.out.println(children1.name); // 123
        System.out.println(children1.name1); // mnb
        System.out.println(children1.name2); // qweasd
    }
}
