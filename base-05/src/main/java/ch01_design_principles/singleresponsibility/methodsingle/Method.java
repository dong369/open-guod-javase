package ch01_design_principles.singleresponsibility.methodsingle;

/**
 * 方法的单一职责
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class Method {
    public void updateUserInfo(String userName, String address) {

    }

    public void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            // todo somethings01
        } else {
            // todo somethings02
        }

    }

    public void updateUserInfo(String userName, String... parameters) {

    }

    public void updateUserName(String userName) {

    }

    public void updateUserAddress(String address) {

    }
}
