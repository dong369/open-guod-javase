package ch17_composite;

/**
 * @author guodd
 * @since 1.0
 */
public class Course extends CatalogComponent {
    /**
     * 属性描述：名称
     */
    private String name;
    /**
     * 属性描述：价格
     */
    private Double price;

    public Course(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public Double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程名称" + name + "课程价格" + price);
    }
}
