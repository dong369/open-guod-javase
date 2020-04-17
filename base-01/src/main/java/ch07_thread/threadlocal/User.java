package ch07_thread.threadlocal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    /**
     * 属性描述：name
     */
    private String name;

    /**
     * 属性描述：age
     */
    private Integer age;

}
