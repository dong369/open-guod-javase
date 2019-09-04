package ch17_strategy.composite;

import java.lang.annotation.*;

/**
 * project - 综合使用
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/11 时间:12:06
 * @JDK 1.8
 * @Description 功能模块：
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
@Inherited
public @interface Strategy {
    String name() default "";
}
