package ch01_design_principles.openclose;

/**
 * @author guodd
 * @version 1.0
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    // 原价
    public Double getOriginPrice() {
        return super.getPrice();
    }

    // 打折价
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
