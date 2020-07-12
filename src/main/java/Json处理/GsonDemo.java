package Json处理;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Gson 处理
 */
public class GsonDemo {

    private String simpleString = "{\n" +
            "\"name\": \"xiao zhi\",\n" +
            "\"age\": 25,\n" +
            "\"skill\": [\n" +
            "{\"name\": \"Java\", \"type\": \"bankend\", \"flage\": [0, 1, 2]},\n" +
            "{\"name\": \"JavaScript\", \"type\": \"frontend\", \"flage\": [0, 1, 30]},\n" +
            "{\"name\": \"Python\", \"type\": \"bankend\", \"flage\": [80, 1, 2]}\n" +
            "]\n" +
            "}";

    public void simpleChange() {
        // 对象转换成json
        MyInformation myInformation = new Gson().fromJson(simpleString, MyInformation.class);
        System.out.println(myInformation.getSkill().get(2).getName());
        // json字符串转换成对象
        String s = new Gson().toJson(myInformation);
        System.out.println(s);
        // 如果对象是需要转换的对象是list，那么要new TypeToken的形式包装（一个对象中成员有list的类不需要）
        // 工具提供了特殊的JsonObject,JsonArray等类，这些类是专门为对象承载准备的，可以想基础容器一样去操作，比如下面的获取name字段的值
        JsonArray jsonArray = new Gson().toJsonTree(myInformation.getSkill(), new TypeToken<List<SkillItem>>() {
        }.getType()).getAsJsonArray();
        System.out.println(jsonArray.get(1).getAsJsonObject().get("name"));
        String s1 = new Gson().toJson(myInformation.getSkill(), new TypeToken<List<SkillItem>>() {}.getType());
        System.out.println(s1);

    }

    public static void main(String[] args) {
        GsonDemo gsonDemo = new GsonDemo();
        gsonDemo.simpleChange();
    }
}

//简单对象



