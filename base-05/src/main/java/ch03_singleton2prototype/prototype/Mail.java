package ch03_singleton2prototype.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mail implements Cloneable{
    /**
     * 属性描述：name
     */
    private String name;

    /**
     * 属性描述：name
     */
    private String emailAdd;

    /**
     * 属性描述：content
     */
    private String content;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("call clone...");
        return super.clone();
    }
}
