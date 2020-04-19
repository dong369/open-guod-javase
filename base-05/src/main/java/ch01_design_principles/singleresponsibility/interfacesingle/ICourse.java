package ch01_design_principles.singleresponsibility.interfacesingle;

/**
 * 接口的单一职责
 *
 * @author guodd
 * @version 1.0
 */
public interface ICourse {
    String getCourseName();

    byte[] getCourseVideo();

    void studyCurse();

    void refundCurse();
}
