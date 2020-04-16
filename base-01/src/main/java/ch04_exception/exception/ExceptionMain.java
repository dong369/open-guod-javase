package ch04_exception.exception;

/**
 * 功能模块：运行时异常、非运行时异常
 * 重写的方法，不能抛出比被重写方法不同的异常！
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class ExceptionMain {
    public static void main(String[] args) {
        System.out.println(test1());
        System.out.println(test2());
        System.out.println(test3());
        System.out.println(test4());
        System.out.println(test5());
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
        try {
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //
            i = 0;
            return i;
        }
    }

    private static User test3() {
        User user = new User("u1");
        try {
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            user = new User("u2");
        }
        return null;
    }


    private static User test4() {
        User user = new User("u1");
        try {
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            user.setName("u2");
        }
        return null;
    }

    private static int test5() {
        int i = 1;
        for (int j = 0; j < 12; j++) {
            try {
                return i / 0;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                i = 10;
            }
        }
        return i;
    }
}