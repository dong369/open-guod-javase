package ch03_oothinking.override;

/**
 * 方法重写（override）实现的是运行时的多态性（也称为后绑定）
 *
 * @author guodd
 * @version 1.0
 */
public class OverrideUse {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.call();
    }
}
