package ch01_design_principles.singleresponsibility.methodsingle;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/5 时间:20:25
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Method {
    public void updateUserInfo(String userName, String address) {

    }

    public void updateUserInfo(String userName, String address, boolean bool) {
        if (bool){
            // todo somethings01
        }else{
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
