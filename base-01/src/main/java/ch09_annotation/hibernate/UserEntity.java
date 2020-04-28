package ch09_annotation.hibernate;

import lombok.Getter;
import lombok.Setter;

/**
 * @author guodd
 * @version 1.0
 */
@Setter
@Getter
@SetTable(value = "tb_user")
public class UserEntity {
    @SetProperty(name = "guo", length = 1)
    private String name;
    private String address;
    private Integer age;
}