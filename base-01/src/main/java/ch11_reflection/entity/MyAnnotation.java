package ch11_reflection.entity;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:14:50
 * @since JDK1.8
 */
@Documented
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {
    String value() default "hello";
}