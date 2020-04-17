package ch08_reflection.entity;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * 自定义注解
 *
 * @author guodd
 * @version 1.0
 * @since JDK1.8
 */
@Documented
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {
    String value() default "hello";
}