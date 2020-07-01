package old.learn;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-03-16 19:37
 */
class student1 {
    public String name;

    public student1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Student {
    public static void main(String[] args) {
        student1 hhh = new student1("hhh");
        System.out.println(hhh.getName());
    }
}

