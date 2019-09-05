package ch08_flyweight;

/**
 * project - 享元模式
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/4 时间:8:30
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest {
    private static final String departments[] = {"RD", "QA", "DB","HR"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getEmployee(department);
            manager.report();
        }

    }
}
