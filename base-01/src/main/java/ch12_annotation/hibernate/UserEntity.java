package ch12_annotation.hibernate;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/9/12 时间:21:38
 * @JDK 1.8
 * @Description 功能模块：
 */
@SetTable(value = "tb_user")
public class UserEntity {
    @SetProperty(name = "guod", length = 1)
    private String name;
    private String address;
    private Integer age;
}