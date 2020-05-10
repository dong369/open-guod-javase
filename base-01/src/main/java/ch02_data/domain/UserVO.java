package ch02_data.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * The class/interface view object 表现层对象，最终返回给前端的对象
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
@Setter
@Getter
@Builder
public class UserVO {
    private Integer id;
    private String studentName;
    private Integer studentAge;
    private String schoolName;
}
