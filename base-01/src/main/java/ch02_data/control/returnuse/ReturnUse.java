package ch02_data.control.returnuse;

/**
 * The class/interface 程序返回，不再执行下面的代码 (结束当前的方法 直接返回)
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class ReturnUse {
    public static void main(String[] args) {
        String test = test();
        System.out.println(test);
    }

    private static String test() {
        return null;
    }
}
