package old.ioclearn;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@ParentsAnnotation(parentsName = {"1", "2"}, parentsAge = 2)
class Test {
    @ParentsAnnotation(parentsName = {"1", "2"}, parentsAge = 2)
    @MyAnnotation(name = "x", id = 1)
    public void test() {

    }

    //    @ParentsAnnotation(parentsName = {"1", "2"}, parentsAge = 2)
    public void test1() {

    }
}

public class TestAnnotation {
    public static void main(String[] args) throws NoSuchMethodException {
//        Class<Test> c = Test.class;
//        Method method = c.getMethod("test");
//        Annotation[] av = c.getDeclaredAnnotations();
//        Annotation[] annotationsArray = method.getDeclaredAnnotations();
//        Annotation annotation1 = annotationsArray[0];
//        MyAnnotation annotation = (MyAnnotation) annotationsArray[1];
//        System.out.println(annotation.name());
//        System.out.println(annotation.parentsannotation().parentsAge());
          getAnnotationTest();
    }

    public static void getAnnotationTest () {
        Class<MyAnnotation> c = MyAnnotation.class;
        Method[] method = c.getDeclaredMethods();
        Annotation[] annotationsArray = method[1].getDeclaredAnnotations();
    }
}
