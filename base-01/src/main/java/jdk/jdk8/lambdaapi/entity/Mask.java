package jdk.jdk8.lambdaapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 2020/3/22
 * @since 1.8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mask {
    /**
     * 品牌
     */
    private String brand;
    /**
     * 类型
     */
    private String type;
    /**
     * 价格
     */
    private Double price;
}
