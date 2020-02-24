package ch01_design_principles.openclose;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/29 时间:13:06
 * @JDK 1.8
 * @Description 功能模块：
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
