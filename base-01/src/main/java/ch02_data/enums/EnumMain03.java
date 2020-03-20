package ch02_data.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

/**
 * project - 枚举类型
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/14 时间:13:11
 * @JDK 1.8
 * @Description 功能模块：用法二：向枚举中添加新方法
 */
public enum EnumMain03 {
    SMS {
        @Override
        public String getParamNameOnValidate() {
            return "手机卡";
        }
    },
    CSS() {
        @Override
        public String getParamNameOnValidate() {
            return "手机卡";
        }
    };

    public abstract String getParamNameOnValidate();
}
