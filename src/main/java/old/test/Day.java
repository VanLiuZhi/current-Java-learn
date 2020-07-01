package old.test;

import java.util.Arrays;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-01-20 15:22
 */
public class Day {
    public static void main(String[] args) {
        Food cf = chineseFood.dumpling;
        Food jf = Food.JapaneseFood.fishpiece;
        for (Food food : chineseFood.values()) {
            System.out.println(food);
        }
        iter();
    }

    private static void iter() {
        for (Food food : Food.JapaneseFood.values()) {
            System.out.println(food);
        }
    }
}

interface Food {
    enum JapaneseFood implements Food {
        suse, fishpiece
    }
}

enum chineseFood implements Food {
    dumpling, tofu;

}

