package old.learn;

import java.util.*;

public class PassWordUtils {


    @UseCase(id=47, description = "hello")
    public boolean validatePassWord(String password) {
        return (password.matches("\\w*\\d\\W*"));
    }

}
