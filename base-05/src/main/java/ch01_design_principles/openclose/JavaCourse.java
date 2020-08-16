package ch01_design_principles.openclose;

import lombok.Data;

/**
 * @author guodd
 * @version 1.0
 */
@Data
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double Price;

    JavaCourse(Integer id, String name, Double price) {
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
