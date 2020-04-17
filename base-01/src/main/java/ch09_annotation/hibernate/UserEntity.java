package ch09_annotation.hibernate;

/**
 * @author guodd
 * @version 1.0
 */
@SetTable(value = "tb_user")
public class UserEntity {
    @SetProperty(name = "guod", length = 1)
    private String name;
    private String address;
    private Integer age;
}