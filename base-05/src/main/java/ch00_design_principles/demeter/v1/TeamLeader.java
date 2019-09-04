package ch00_design_principles.demeter.v1;

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
class TeamLeader {
    void checkNumberOfCourse(List<Course> courseList) {
        System.out.println("课程数量：" + courseList.size());
    }
}