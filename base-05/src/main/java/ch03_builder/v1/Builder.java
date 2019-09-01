package ch03_builder.v1;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/1 时间:9:02
 * @JDK 1.8
 * @Description 功能模块：抽象建造者
 */
public abstract class Builder {
    public abstract void builderCourseName(String courseName);

    public abstract void builderCourseVideo(String courseVideo);

    public abstract void builderCoursePrice(Double coursePrice);

    public abstract Product makeProduct();
}
