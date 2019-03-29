package ch02_data.builder;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/7 时间:13:11
 * @JDK 1.8
 * @Description 功能模块：多重构造器+JavaBean+构建器
 */
public class MainBuilderTest {
    public static void main(String[] args) {
        Person.Builder builder = new Person.Builder();
        Person person = builder.age(12).name("guo").builder();
        System.out.println(person.getAge());
    }
}

class Person {
    private String name;
    private Integer age;

    private Person() {
    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
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

    public static class Builder {
        private String name;
        private Integer age;

        public Builder() {
        }

        public Builder name(String name) {
            if (name == null) {
                throw new IllegalArgumentException("");
            } else {
                this.name = name;
                return this;
            }
        }

        public Builder age(Integer age) {
            if (age < 0) {
                throw new IllegalArgumentException("");
            } else {
                this.age = age;
                return this;
            }
        }

        public Person builder() {
            return new Person(this);
        }
    }
}
