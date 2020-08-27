package ch08_strategy.composite;

import java.lang.annotation.*;

/**
 * project - 综合使用
 *
 * @author guodd
 * @version 1.0
 * 用在了两个地方，一个是20多家银行的对接，一个是硬件，多个厂商，协议不同的对接。
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
@Inherited
public @interface Strategy {
    String name() default "";
}
