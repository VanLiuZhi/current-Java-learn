package old.cast;


import com.sun.tools.javac.util.Assert;

import java.security.AccessControlException;

public class MainTest {

    protected ConfigurableApplicationContext createdApplicationContext() {
        return (ConfigurableApplicationContext) new AnnotationConfigServletWebServerApplicationContext();
    }

    private void refreshContext(ConfigurableApplicationContext context) {
        refresh(context);
    }

    protected void refresh(ConfigurableApplicationContext applicationContext) {
        if (applicationContext instanceof AbstractApplicationContext) {
            ((AbstractApplicationContext) applicationContext).refresh();
        }
    }

    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
        mainTest.refreshContext(mainTest.createdApplicationContext());
    }
}
