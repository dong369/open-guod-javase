package lombok;

import lombok.experimental.Accessors;

/**
 * project -
 *
 * @author yanfa07
 * @version 1.0
 * @date 日期:2019/4/23 时间:8:13
 * @JDK 1.8
 * @Description 功能模块：
 */
@Accessors(chain = true)
@Setter
@Getter
@RequiredArgsConstructor(staticName = "of")
public class Lombok {
    /**
     * 属性描述：name
     */
    @NonNull
    private String name;

    /**
     * 功能描述：age
     */
    private Integer age;

    public static void main(String[] args) {
        Lombok lombok = Lombok.of("guo").setAge(22);
        System.out.println(lombok.getName() + lombok.getAge());
    }
}