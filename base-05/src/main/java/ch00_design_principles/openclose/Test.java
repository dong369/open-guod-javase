package ch00_design_principles.openclose;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/29 时间:13:03
 * @JDK 1.8
 * @Description 功能模块：开闭原则
 */
public class Test {
    public static void main(String[] args) {
        Course course = new JavaDiscountCourse(1, "java", 23D);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse) course;
        System.out.println(course.getName() + "," + course.getId() + "," + course.getPrice() + "," + discountCourse.getOriginPrice());
    }
}
