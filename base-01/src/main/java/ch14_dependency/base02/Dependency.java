package ch14_dependency.base02;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/31 时间:13:11
 * @since 1.8
 */
public class Dependency {
    @StringAnnotation("张三")
    public String name = "猜我是谁";


    public static void main(String[] args) throws Exception {
        Dependency dependency = new Dependency();
        // 解析注解，为成员变量赋值
        ParseAnnotation.parseAnnotation(dependency);
        // 打印注入后的值
        System.out.println("======Dependency name =======" + dependency.name);
    }
}
