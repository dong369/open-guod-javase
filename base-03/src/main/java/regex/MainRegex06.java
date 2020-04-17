package regex;

/**
 * 空白行、^、$
 *
 * @author guodd
 * @version 3.0
 */
public class MainRegex06 {
    public static void main(String[] args) {
        // 开头的是一个空白符但不是一个换行符出现零次或多出以换行符结尾
        System.out.println(" \n".matches("^[\\s&&[^\\n]]*\\n$"));
        System.out.println("https://test".matches("^(https?:\\/\\/)?\\w*"));
    }
}
