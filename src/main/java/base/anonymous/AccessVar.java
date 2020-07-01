package base.anonymous;

/**
 * @Description 匿名内部类访问外部变量
 * @Author VanLiuZhi
 * @Date 2020-03-30 14:48
 */
public class AccessVar {
    final Dog dog = new Dog(1);

    public static void main(String[] args) {
        new AccessVar().play();
    }

    private void play() {
        Runnable runnable = () -> {
            while (dog.getAge() < 100) {
                // 过生日，年龄加一
                dog.happyBirthday();
                // 打印年龄
                System.out.println(dog.getAge());
            }
        };
        new Thread(runnable).start();
    }

    // jdk8后，不需要final修饰，但是对应的变量不能去操作
    static {
        int answer = 42;
        // answer ++; // don't do this !
        Thread t = new Thread(
                () -> System.out.println("The answer is: " + answer)
        );
    }
}

class Dog {
    private Integer age;

    public Dog(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void happyBirthday() {
        this.age++;
    }
}
