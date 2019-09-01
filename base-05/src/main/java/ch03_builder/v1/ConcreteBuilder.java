package ch03_builder.v1;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/1 时间:9:03
 * @JDK 1.8
 * @Description 功能模块：具体建造者
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
