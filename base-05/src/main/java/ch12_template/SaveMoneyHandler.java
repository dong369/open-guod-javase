package ch12_template;

/**
 * project - 
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/8/8 时间:8:05
 * @JDK 1.8
 * @Description 功能模块：
 */
public class SaveMoneyHandler extends AbstractBusiness {
    @Override
    public void handle() {
        System.out.println("办理业务存入现金：1000");
    }

    @Override
    public boolean isVip() {
        return false;
    }
}