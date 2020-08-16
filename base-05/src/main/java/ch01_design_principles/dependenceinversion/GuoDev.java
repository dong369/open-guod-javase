package ch01_design_principles.dependenceinversion;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The class/interface 依赖具体的实现方式
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
@Data
@NoArgsConstructor
public class GuoDev {
    ICourse iCourse;

    public GuoDev(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.studyCourse();
    }

//    public void studyCourse(ICourse iCourse) {
//        iCourse.studyCourse();
//    }

    public void studyJava() {
        System.out.println("study Java course");
    }

    public void studyPython() {
        System.out.println("study Python course");
    }

    public void studyGo() {
        System.out.println("study Go course");
    }
}
