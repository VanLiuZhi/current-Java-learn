package Json处理;

import com.alibaba.fastjson.JSONObject;

/**
 * @author liuzhi
 */
public class FastJsonDemo {
    public static void JsonStringToPOJO() {
        String a = "{\n" +
                "\t\"部门名称\":\"研发部\",\n" +
                "\t\"部门成员\":[\n" +
                "\t{\"ID\": 1001, \"name\": \"张三\", \"age\": 24},\n" +
                "\t{\"ID\": 1002, \"name\": \"李四\", \"age\": 25},\n" +
                "\t{\"ID\": 1003, \"name\": \"王五\", \"age\": 22}],\n" +
                "\t\"部门位置\":\"xx楼21号\"\n" +
                "}";
        new JSONObject();
    }
}
