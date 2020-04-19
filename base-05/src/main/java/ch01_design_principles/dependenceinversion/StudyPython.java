package ch01_design_principles.dependenceinversion;

/**
 * The class/interface 具体的实现细节
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class StudyPython implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("study python course");
    }
}
