package ch04_builder.v1;

import lombok.Data;

/**
 * project -
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
}
