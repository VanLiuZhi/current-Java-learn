package old.ioclearn;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD)
@Documented
public @interface MyAnnotation {
    String name();

    @Filter(FilterType = "MyFilterTest")
    int id();

    ParentsAnnotation parentsannotation() default @ParentsAnnotation(parentsName = {"!"}, parentsAge = 1);

    @Retention(RetentionPolicy.RUNTIME)
    @ParentsAnnotation(parentsName = {"a", "b"}, parentsAge = 20)
    @interface Filter {
        String FilterType();
    }
}

