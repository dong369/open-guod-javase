package ch12_annotation.extract;

import java.lang.annotation.*;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/4/12 时间:18:10
 * @since 1.8
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
}
