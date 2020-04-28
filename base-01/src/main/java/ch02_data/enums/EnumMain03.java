package ch02_data.enums;

/**
 * 用法二：向枚举中添加新方法
 *
 * @author guod
 * @version 1.0
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

    public static void main(String[] args) {
        System.out.println(EnumMain03.valueOf("SMS").getParamNameOnValidate());
    }
}
