package ch02_data.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * The class/interface persistent object 持久对象，对应数据库中的一条记录
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
@Getter
@Setter
@Builder
public class UserPO {
    private Integer id;
    private String name;
    private Integer age;
    private String className;
}
