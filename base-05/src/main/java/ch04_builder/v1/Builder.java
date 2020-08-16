package ch04_builder.v1;

/**
 * @author guodd
 * @version 1.0
 */
public abstract class Builder {
    public abstract void builderCourseName(String courseName);

    public abstract void builderCourseVideo(String courseVideo);

    public abstract void builderCoursePrice(Double coursePrice);

    public abstract Product makeProduct();
}
