package ch04_exceptions.exception;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/15 时间:16:24
 * @JDK 1.8
 * @Description 功能模块：运行时异常、非运行时异常
 */
public class ExceptionMainTest {
    public static void main(String[] args) {
        System.out.println(test1());
        System.out.println(test2());

    }

    private static int test1() {
        int i = 1;
        try {
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            i = 0;
        }
        return i;
    }

    private static int test2() {
        int i = 1;
        for (int j = 0; j < 12; j++) {
            try {
                return i / 0;
                // } catch (ArrayIndexOutOfBoundsException e) {
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                i = 0;
            }
        }
        return i;
    }
}
