package ch09_annotation.extract;

import java.lang.annotation.*;

/**
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {
    String value();
}
