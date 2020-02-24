package ch05_factory.simplefactory;

/**
 * project - 简单工厂
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/31 时间:22:25
 * @JDK 1.8
 * @Description 功能模块：工厂角色负责实现创建所有实例的内部逻辑
 */
public class SimpleFactory {
    public static CourseI getInstance(Class c) {
        CourseI course = null;
        try {
            // 可以通过传入的名称进行判断然后返回对象 if("java".equals(""))
            course = (CourseI) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return course;
    }
}
