package ch01_design_principles.demeter.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 某人
 *
 * @author guodd
 * @version 1.0
 */
class Boos {
    // 出现在成员变量、方法的输入、输出参数中的类称为成员朋友类
    void commandCheckNumber(TeamLeader teamLeader) {
        // 出现在方法体内部的类不属于朋友类
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        teamLeader.checkNumberOfCourse(courses);
    }
}
