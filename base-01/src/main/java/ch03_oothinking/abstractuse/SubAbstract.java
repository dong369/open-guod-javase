package ch03_oothinking.abstractuse;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class SubAbstract extends UseAbstract {
    public static void main(String[] args) {
        UseAbstract useAbstract = new SubAbstract();
        useAbstract.info();
        useAbstract.info01();
    }

    @Override
    public void info01() {
        System.out.println("info01");
    }
}
