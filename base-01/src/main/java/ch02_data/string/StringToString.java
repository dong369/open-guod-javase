package ch02_data.string;

import com.google.common.base.MoreObjects;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;

import java.util.Arrays;

/**
 * Project -
 *
 * @Create by guodd
 * @Version 1.0
 * @Date 日期:2019/1/3 时间:14:50
 * @JDK 1.8
 * @Description
 */
public class StringToString {
    public static void main(String[] args) {
        A a = new A();
        a.setName("guo");
        System.out.println(ToStringBuilder.reflectionToString(a));
        System.out.println(MoreObjects.toStringHelper(a).add("name", "gu").toString());
        System.out.println(Arrays.toString(new Arrays[]{}));
    }

    static class A {
        /**
         * 属性描述：name
         */
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
