package ch12_annotation.extract;

import java.lang.annotation.*;

/**
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
}
