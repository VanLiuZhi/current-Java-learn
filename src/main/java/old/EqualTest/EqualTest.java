package old.EqualTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-01-19 16:36
 */
public class EqualTest {

    public static Object getPrivateField(Object instance, String filedName) throws NoSuchFieldException, IllegalAccessException {
        Field field = instance.getClass().getDeclaredField(filedName);
        field.setAccessible(true);
        return field.get(instance);
    }

    public static void main(String[] args) throws
            IllegalAccessException, NoSuchFieldException,
            NoSuchMethodException, InvocationTargetException, InstantiationException {
//        StringBuffer a = new StringBuffer("a");
//        StringBuffer b = new StringBuffer("a");

        String aa = new String("aa");
        String bb = new String("aa");

        bb = aa;

        String a = "123";
        String b = "123";

        EqualTest equalTest = new EqualTest();
        EqualTest equalTest1 = new EqualTest();

//        System.out.println(aa == bb);
//        System.out.println(aa.equals(bb));
//
//        System.out.println(a == b);
//        System.out.println(a.equals(b));
        aa.hashCode();
        System.out.println(getPrivateField(aa, "hash"));

    }
}
