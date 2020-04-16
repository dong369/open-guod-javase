package ch12_annotation.base;

/**
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class AnnotationDemo {
    /**
     * 属性描述：属性
     */
    @MyAnnotation(name = "userName")
    private String name;

    /**
     * 功能描述：属性
     */
    @MyAnnotation(name = "userAge")
    private Integer age;


    @MyAnnotation(name = "lvr", website = "hellos", revision = 22)
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    @MyAnnotation(name = "lvr", website = "hellos", revision = 2)
    public void demo() {
        System.out.println("I am demo method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
