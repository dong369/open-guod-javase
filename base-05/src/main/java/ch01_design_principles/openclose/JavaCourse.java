package ch01_design_principles.openclose;

/**
 * @author guodd
 * @version 1.0
 */
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double Price;

    JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        Price = price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
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
