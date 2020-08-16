package ch05_factory.simplefactory;

/**
 * project - 简单工厂（静态工厂方法）
 *
 * @author guodd
 * @version 1.0
 * 功能模块：工厂角色负责实现创建所有实例的内部逻辑
 */
public class SimpleFactory {
    public static CourseI getInstance(Class<?> c) {
        CourseI course = null;
        try {
            // 可以通过传入的名称进行判断然后返回对象 if("java".equals(""))
            // course = (CourseI) Class.forName(c.getName()).newInstance();
            course = (CourseI) c.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return course;
    }
}
