package ch02_data.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class PrintObject {
    @Test
    public void printObject() {
        System.out.println(ToStringBuilder.reflectionToString(new A("guo", 26)));
    }

    @Test
    public void printArrays() {
        List<A> as = Arrays.asList(new A("guo", 26), new A("dong", 20));
        System.out.println(as);
        System.out.println(Arrays.toString(new List[]{as}));
    }
}

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
class A {
    /**
     * 属性描述：name
     */
    private String name;

    /**
     * 属性描述：age
     */
    private Integer age;
}