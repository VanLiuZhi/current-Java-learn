package springioc;

import java.util.concurrent.BlockingQueue;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-04-09 15:11
 */
public class DefaultLast implements ConfigAble, Register {
    @Override
    public void getBeanDefinition(String name) {
        System.out.println(name);
    }

    public void getName(String name){
        System.out.println("name" + name);
    }

    public static void main(String[] args) {
        ConfigAble defaultLast = new DefaultLast();
        defaultLast.getBeanDefinition("testBean");
        System.out.println(defaultLast instanceof ConfigAble);
        System.out.println(defaultLast instanceof DefaultLast);
        System.out.println(defaultLast instanceof Register);
    }
}
