package ch01_design_principles.openclose;

/**
 * Open Closed Principle，开闭原则，核心是抽象，抽象构建框架，实现扩展细节
 * 扩展开放、修改关闭
 *
 * @author guodd
 * @version 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        JavaDiscountCourse course = new JavaDiscountCourse(1, "java", 23D);
        System.out.println(course.getName() + "," + course.getId() + "," + course.getPrice() + "," + course.getOriginPrice());
    }
}
