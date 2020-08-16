package ch04_builder.v2;

import lombok.Data;

/**
 * 产品角色
 *
 * @author guodd
 * @version 1.0
 */
@Data
public class Product {
    /**
     * 属性描述：课程名称
     */
    private String courseName;
    /**
     * 属性描述：课程视频
     */
    private String courseVideo;
    /**
     * 功能描述：课程价格
     */
    private Double coursePrice;

    private Product(Builder builder) {
        this.courseName = builder.getCourseName();
        this.courseVideo = builder.getCourseVideo();
        this.coursePrice = builder.getCoursePrice();
    }

    @Data
    public static class Builder {
        private String courseName;
        private String courseVideo;
        private Double coursePrice;

        Builder courseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public Builder courseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        Builder coursePrice(Double coursePrice) {
            this.coursePrice = coursePrice;
            return this;
        }

        Product build() {
            return new Product(this);
        }
    }
}
