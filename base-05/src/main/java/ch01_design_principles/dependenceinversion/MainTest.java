package ch01_design_principles.dependenceinversion;

/**
 * Dependence Inversion Principle，依赖倒置原则
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class MainTest {
    public static void main(String[] args) {
//        GuoDev guoDev = new GuoDev();
//        guoDev.studyJava();
//        guoDev.studyPython();
//        guoDev.studyGo();
        GuoDev guoDev = new GuoDev();
        guoDev.studyCourse(new StudyJava());
        guoDev.studyCourse(new StudyPython());
    }
}
