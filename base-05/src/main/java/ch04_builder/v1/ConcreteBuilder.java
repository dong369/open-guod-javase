package ch04_builder.v1;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();


    @Override
    public void builderCourseName(String courseName) {
        product.setCourseName(courseName);
    }

    @Override
    public void builderCourseVideo(String courseVideo) {
        product.setCourseVideo(courseVideo);
    }

    @Override
    public void builderCoursePrice(Double coursePrice) {
        product.setCoursePrice(coursePrice);
    }

    @Override
    public Product makeProduct() {
        return product;
    }
}
