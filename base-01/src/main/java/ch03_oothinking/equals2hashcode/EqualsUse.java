package ch03_oothinking.equals2hashcode;

/**
 * 1、如果两个对象equals，Java运行时环境会认为他们的hashcode一定相等。
 * 2、如果两个对象不equals，他们的hashcode有可能相等。
 * 3、如果两个对象hashcode相等，他们不一定equals。
 * 4、如果两个对象hashcode不相等，他们一定不equals。
 * 规范1：若重写equals(Object obj)方法，有必要重写hashcode()方法，确保通过equals(Object obj)方法判断结果为true的两个对象具备相等的hashcode()返回值。
 * 如果两个对象相同，那么他们的hashcode应该相等
 * 规范2：如果equals(Object obj)返回false，即两个对象“不相同”，并不要求对这两个对象调用hashcode()方法得到两个不相同的数。
 * 如果两个对象不相同，他们的hashcode可能相同
 * HashCode被设计用来提高性能。equals()方法与hashCode()方法的区别在于：
 * 如果两个对象相等(equal)，那么他们一定有相同的哈希值。
 * 如果两个对象的哈希值相同，但他们未必相等(equal)。
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class EqualsUse {
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
}