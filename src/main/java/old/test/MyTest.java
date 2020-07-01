package old.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person {
    //属性
    private String name;
    private int age;

    //方法
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class MyTest {
    public static void main(String[] args) {
        /*对象数组：定义数组来承载对象
         * 缺点：数组一旦确定长度，不可修改
         * */
        Person[] person = new Person[3];
        Person one = new Person("小明", 18);
        Person two = new Person("小李", 28);
        Person three = new Person("小张", 38);
        person[0] = one;    //地址值
        person[1] = two;    //地址值
        person[2] = three;  //地址值

        ArrayList<Person> people = new ArrayList<>(Arrays.asList(person));
    }
}
