package ch01_design_principles.demeter.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guodd
 * @version 1.0
 */
class Boos {
    void commandCheckNumber(TeamLeader teamLeader) {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        teamLeader.checkNumberOfCourse(courses);
    }
}
