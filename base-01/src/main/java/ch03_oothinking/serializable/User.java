package ch03_oothinking.serializable;

import lombok.Data;

import java.io.Serializable;

/**
 * 串行化是将对象转换成某种格式的字节数组
 * 串行化使用场景：将对象进行网络间的传输；本地化存储
 */
@Data
public class User implements Serializable {
    //
    private String name = "guo";
}
