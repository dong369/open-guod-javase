package ch08_reflection.entity;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @since JDK1.8
 */
@Documented
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited  // 继承的
public @interface MyAnnotations {
    MyAnnotation[] value();
}