package ch03_oothinking.override;

/**
 * @author guodd
 * @version 1.0
 */
public class Dog extends Animal {
    @Override
    public void call() {
        System.out.println("狗叫");
    }
}
