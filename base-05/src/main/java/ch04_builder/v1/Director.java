package ch04_builder.v1;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
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
