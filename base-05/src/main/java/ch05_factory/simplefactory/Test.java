package ch05_factory.simplefactory;


/**
 * project - 简单工厂
 *
 * @author guodd
 * @version 1.0
 * @see java.sql.DriverManager（getConnection方法）
 * @see java.util.Calendar（getInstance方法）
 * @see org.slf4j.LoggerFactory（getLogger方法）
 */
public class Test {
    public static void main(String[] args) {
        CourseI instance = SimpleFactory.getInstance(CourseJavaImpl.class);
        instance.content();
    }
}
