package ch01_design_principles.singleresponsibility.interfacesingle;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/5 时间:20:19
 * @JDK 1.8
 * @Description 功能模块：
 */
public interface ICourse {
    String getCourseName();
    byte [] getCourseVideo();

    void studyCurse();
    void refundCurse();
}
