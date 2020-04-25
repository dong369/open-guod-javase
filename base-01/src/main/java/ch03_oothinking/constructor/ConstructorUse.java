package ch03_oothinking.constructor;

import lombok.Getter;
import lombok.Setter;

/**
 * The class/interface 构造器
 * 构造器不能被继承，因此不能被重写，但可以被重载。
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class ConstructorUse {
    /**
     * 属性描述：name
     */
    @Setter
    @Getter
    private String name;

    public ConstructorUse() {
        System.out.println("constructor...");
    }

    public ConstructorUse(String name) {
        this.name = name;
    }
}