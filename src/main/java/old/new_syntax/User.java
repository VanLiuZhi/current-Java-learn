package old.new_syntax;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author VanLiuZhi
 * @Date 2020-01-19 14:53
 */
public class User {
    public Integer id;
    public String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}

class UserUtil {

    public static HashMap<Integer, User> hashMap;

    UserUtil(HashMap<Integer, User> hashMap) {
        UserUtil.hashMap = hashMap;
    }

    public static User getUserByUserId(Integer id) {
        User user = hashMap.get(id);
        System.out.println(user);
        return user;
    }
}
