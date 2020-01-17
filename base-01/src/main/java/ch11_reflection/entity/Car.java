package ch11_reflection.entity;

/**
 * Project -
 *
 * @Create by guodd
 * @Version 1.0
 * @Date 日期:2019/1/3 时间:14:50
 * @JDK 1.8
 * @Description
 */
public class Car {
    private String color;
    private Double price;

    public Car() {
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMarketPrice() {
        return price + 100;
    }

    @Override
    public String toString() {
        return color + "," + price;
    }
}
