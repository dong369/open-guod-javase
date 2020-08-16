package ch04_builder.v1;

/**
 * @author guodd
 * @version 1.0
 */
public class Director {
    ConcreteBuilder concreteBuilder = new ConcreteBuilder();

    public Product makeProduct(String courseName, String courseVideo, Double coursePrice) {
        this.concreteBuilder.builderCourseName(courseName);
        this.concreteBuilder.builderCourseVideo(courseVideo);
        this.concreteBuilder.builderCoursePrice(coursePrice);
        return this.concreteBuilder.makeProduct();
    }
}
