package ch01_design_principles.demeter.v1;

import java.util.List;

/**
 * 朋友
 *
 * @author guodd
 * @version 1.0
 */
class TeamLeader {
    void checkNumberOfCourse(List<Course> courseList) {
        System.out.println("课程数量：" + courseList.size());
    }
}