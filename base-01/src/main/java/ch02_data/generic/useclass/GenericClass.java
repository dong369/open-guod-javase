package ch02_data.generic.useclass;

/**
 * 语法格式：访问修饰符 非访问修饰符 类名称<泛型标识：可以随便写任意标识号（T、E、K、V） , 标识指定的泛型的类型> { 程序控制语句 }
 *
 * @author by guodd
 * @version 1.0
 * @since 1.8
 */
public class GenericClass<T> {
    private String name;
    private Integer age;
    private T t;

    public GenericClass() {
    }

    public GenericClass(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public GenericClass(String name, Integer age, T t) {
        this.name = name;
        this.age = age;
        this.t = t;
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

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", t=" + t +
               '}';
    }
}
