package ch04_builder.v1;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/1 时间:9:03
 * @JDK 1.8
 * @Description 功能模块：指挥者
 */
public class Director {
    private ConcreteBuilder concreteBuilder = new ConcreteBuilder();

    public void setConcreteBuilder(ConcreteBuilder concreteBuilder) {
        this.concreteBuilder = concreteBuilder;
    }

    public Product makeProduct(String courseName, String courseVideo, Double coursePrice) {
        this.concreteBuilder.builderCourseName(courseName);
        this.concreteBuilder.builderCourseVideo(courseVideo);
        this.concreteBuilder.builderCoursePrice(coursePrice);
        return this.concreteBuilder.makeProduct();
    }
}
