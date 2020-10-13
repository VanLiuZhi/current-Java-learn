package Json处理;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SkillItem{

    @SerializedName("flage")
    private List<Integer> flage;

    @SerializedName("name")
    private String name;

    @SerializedName("type")
    private String type;

    public void setFlage(List<Integer> flage){
        this.flage = flage;
    }

    public List<Integer> getFlage(){
        return flage;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    @Override
     public String toString(){
        return 
            "SkillItem{" + 
            "flage = '" + flage + '\'' + 
            ",name = '" + name + '\'' + 
            ",type = '" + type + '\'' + 
            "}";
        }
}