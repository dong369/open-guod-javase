package regex;

/**
 * project - 正则表达式
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/16 时间:21:08
 * @JDK 1.8
 * @Description 功能模块：空白行、^、$
 */
public class MainRegex06 {
    public static void main(String[] args) {
        // 开头的是一个空白符但不是一个换行符出现零次或多出以换行符结尾
        System.out.println(" \n".matches("^[\\s&&[^\\n]]*\\n$"));
        System.out.println("https://test".matches("^(https?:\\/\\/)?\\w*"));
    }
}
