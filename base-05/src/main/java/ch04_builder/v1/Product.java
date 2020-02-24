package ch04_builder.v1;

import lombok.Data;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/1 时间:8:59
 * @JDK 1.8
 * @Description 功能模块：产品角色
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
