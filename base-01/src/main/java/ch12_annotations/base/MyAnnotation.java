package ch12_annotations.base;

import java.lang.annotation.*;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/12 时间:9:24
 * @JDK 1.8
 * @Description 功能模块：
 */
@Documented
@Target({ElementType.METHOD, ElementType.FIELD})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String name() default "";

    String website() default "hello";

    int revision() default 1;
}
