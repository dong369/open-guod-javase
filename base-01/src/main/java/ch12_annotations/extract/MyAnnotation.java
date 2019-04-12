package ch12_annotations.extract;

import java.lang.annotation.*;

/**
 * project -
 *
 * @author yanfa07
 * @version 1.0
 * @date 日期:2019/4/12 时间:18:10
 * @JDK 1.8
 * @Description 功能模块：
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
}
