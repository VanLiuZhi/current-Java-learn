package Json处理;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MyInformation {

    @SerializedName("skill")
    private List<SkillItem> skill;

    @SerializedName("name")
    private String name;

    @SerializedName("age")
    private int age;

    public void setSkill(List<SkillItem> skill){
        this.skill = skill;
    }

    public List<SkillItem> getSkill(){
        return skill;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
     public String toString(){
        return 
            "Response{" + 
            "skill = '" + skill + '\'' + 
            ",name = '" + name + '\'' + 
            ",age = '" + age + '\'' + 
            "}";
        }
}