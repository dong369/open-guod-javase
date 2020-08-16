package ch01_design_principles.dependenceinversion;

/**
 * Dependence Inversion Principle，依赖倒置原则，简称DIP
 * 依赖倒置原则更加精确的定义就是“面向接口编程”——OOD（Object-Oriented Design）的精髓之一。
 * 依赖倒置是实现开闭原则的重要途径，依赖倒置原则没有实现，就不能实现对扩展的开放，对修改关闭。
 * 在项目中，只要抓住“面向接口编程”就基本抓住了依赖倒置的原则。
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class Test {
    public static void main(String[] args) {
        // V1 方法
//        GuoDev guoDev = new GuoDev();
//        guoDev.studyJava();
//        guoDev.studyPython();
//        guoDev.studyGo();
        // V2 方法
//        GuoDev guoDev = new GuoDev();
//        guoDev.studyCourse(new StudyJava());
//        guoDev.studyCourse(new StudyPython());
        // V3 构造器
//        GuoDev guoDev = new GuoDev(new StudyJava());
//        guoDev.studyCourse();
        // V4 setter方式
        GuoDev guoDev = new GuoDev();
        guoDev.setICourse(new StudyPython());
        guoDev.studyCourse();
    }
}
