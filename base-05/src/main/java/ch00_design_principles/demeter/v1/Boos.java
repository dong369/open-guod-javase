package ch00_design_principles.demeter.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/1 时间:21:53
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Boos {
    public void commandCheckNumber(TeamLeader teamLeader) {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        teamLeader.checkNumberOfCourse(courses);
    }
}
