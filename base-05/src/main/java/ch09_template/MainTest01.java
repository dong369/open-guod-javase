package ch09_template;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:19:28
 * @JDK 1.8
 * @Description 功能模块：模板方法（Template method）模式
 * 注意01：模式大致分为两种角色：抽象模板(AbstractTemplate)，具体模板(ConcreteTemplate)。
 * 1、抽象模板(AbstractTemplate)
 * a. 抽象模板类定义了一系列基本操作(PrimitiveOperations)，这些操作可以是抽象的，也可以是具体的，每一个操作对应算法的一个实现步骤，而在子类中可以重写或实现这些步骤。
 * b. 抽象类中实现了一个或多个模板方法，用于定义一个算法的完整步骤。该方法通常情况下会定义为final类型，防止子类对算法的步骤进行修改。而在该方法内部，会调用我们的抽象方法或具体方法来一步一步实现整个算法。
 * 2、具体模板(ConcreteTemplate)
 * a. 具体模板一般要实现父类所定义的一个或多个抽象方法，来完成我们所需要的功能。通过不同的具体模板类实现父类的抽象方法，从而完成不同功能的实现。
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 银行办理业务：取号 -> 办理业务 -> 结束
        AbstractBusiness save = new SaveMoneyHandler();
        save.execute();
    }
}