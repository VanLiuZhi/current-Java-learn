package old.test;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-02-06 22:28
 */
public class iteration {
    public static void main(String[] args) throws InterruptedException {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("ex");
        arrayList.add("ex321");
        for (String s : arrayList) {
            System.out.println(s);
            if (s.equals("ex")) {
                arrayList.remove(s);
                arrayList.add("ex123");
            }
        }
    }
}
