package base.collection;

import javafx.util.Pair;
import old.interior.B;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-04-29 16:12
 */
public class DemoCollection {

    public static void main(String[] args) {

        Pair<String, Object>[] pairs;

        List<Pair<String, Object>> arrayList = new ArrayList<>(3);
        arrayList.add(new Pair<>("version", 6.19));
        arrayList.add(new Pair<>("version2", null));
        arrayList.add(new Pair<>("version3", 8.19));
        Pair<String, Object>[] pairs1 = new Pair[0];
        Pair<String, Object>[] objects = arrayList.toArray(pairs1);
        System.out.println(objects[2]);

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("abc", "Eex");
        objectObjectHashMap.forEach((key, value) -> {
            System.out.println(key);
        });

    }


    private static class Parents {
        private String name;
        private Integer age;

        public Parents(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Parents{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    }
}
