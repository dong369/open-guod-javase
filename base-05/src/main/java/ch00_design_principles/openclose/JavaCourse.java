package ch00_design_principles.openclose;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/29 时间:13:02
 * @JDK 1.8
 * @Description 功能模块：
 */
public class JavaCourse implements Course {
    private Integer id;
    private String name;
    private Double Price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        Price = price;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return Price;
    }
}
