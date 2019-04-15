package ch03_oothinking.equals2hashcode;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/13 时间:13:00
 * @JDK 1.8
 * @Description 功能模块：
 * 1、如果两个对象equals，Java运行时环境会认为他们的hashcode一定相等。
 * 2、如果两个对象不equals，他们的hashcode有可能相等。
 * 3、如果两个对象hashcode相等，他们不一定equals。
 * 4、如果两个对象hashcode不相等，他们一定不equals。
 * 规范1：若重写equals(Object obj)方法，有必要重写hashcode()方法，确保通过equals(Object obj)方法判断结果为true的两个对象具备相等的hashcode()返回值。
 *       如果两个对象相同，那么他们的hashcode应该相等
 * 规范2：如果equals(Object obj)返回false，即两个对象“不相同”，并不要求对这两个对象调用hashcode()方法得到两个不相同的数。
 *       如果两个对象不相同，他们的hashcode可能相同
 */
public class UserEquals {
}
