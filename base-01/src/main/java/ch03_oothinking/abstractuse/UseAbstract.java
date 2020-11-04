package ch03_oothinking.abstractuse;

/**
 * The class/interface 抽象类不一定要包含抽象方法，但包含抽象方法的类一定是抽象类。
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public abstract class UseAbstract {
    public void info() {
        System.out.println("info");
    }

    public abstract void info01();
}
