package old.new_syntax;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-01-19 14:58
 */
public class OptionalTest {
    private static Object NullPointerException;

    public static void main(String[] args) {
        HashMap<Integer, User> userHashMap = new HashMap<>();
        userHashMap.put(1, new User(1, "Xiao Ming"));
        userHashMap.put(2, new User(2, "Xiao Zhi"));
        userHashMap.put(3, null);

        new UserUtil(userHashMap);

        String name = Optional.ofNullable(UserUtil.getUserByUserId(1))
                .filter(user -> user.id == 2)
                .map(user -> user.name)
                .orElse("abc");
        System.out.println(name);
    }
}
