package ch14_dependency.base02;

import java.lang.annotation.*;

/**
 * project - 注解
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/31 时间:13:10
 * @JDK 1.8
 * @Description 功能模块：自定义注解，用于为成员变量赋值
 */
@Target(ElementType.FIELD) // 作用范围：成员变量
@Retention(RetentionPolicy.RUNTIME) // 生命周期：运行时
@Documented // 在文档中显示
public @interface StringAnnotation {
    String value();
}
