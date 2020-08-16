package ch03_singleton2prototype.prototype.clone;


import java.util.Date;

/**
 * The class/interface 深克隆、浅克隆
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class MainTest {
    public static void main(String[] args) throws Exception{
        Pig pig = new Pig("aa",new Date(0L));
        Pig clonePig = (Pig) pig.clone();
        System.out.println(pig);
        System.out.println(clonePig);

        pig.getDateTime().setTime(99996666666666666L);
        System.out.println(pig);
        System.out.println(clonePig);
    }
}
