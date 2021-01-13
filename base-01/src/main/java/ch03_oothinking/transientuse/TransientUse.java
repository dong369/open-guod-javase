package ch03_oothinking.transientuse;

import lombok.Data;

import java.io.Serializable;

/**
 * 序列化
 *
 * @author guodd
 * @version 1.0
 * 1）transient修饰的变量不能被序列化；
 * 2）transient只作用于实现 Serializable接口；
 * 3）transient只能用来修饰普通成员变量字段；
 * 4）不管有没有transient修饰，静态变量都不能被序列化；
 */
@Data
public class TransientUse implements Serializable {
    private final transient int a = 1;
}
