package ch05_factory.simplefactory;

/**
 * @author guodd
 * @version 1.0
 * 功能模块：具体产品角色是创建目标，所有创建的对象都充当这个角色的某个具体类的实例。
 */
public class CourseJavaImpl implements CourseI {
    @Override
    public void content() {
        System.out.println("Java");
    }
}
