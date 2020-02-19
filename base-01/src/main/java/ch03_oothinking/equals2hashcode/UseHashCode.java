package ch03_oothinking.equals2hashcode;

/**
 * HashCode被设计用来[提高性能]。
 * 如果两个对象相等(equal)，那么他们一定有相同的哈希值；如果两个对象的哈希值相同，但他们未必相等(equal)。
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/4 时间:14:45
 * @since 1.8
 */
public class UseHashCode {
    @Override
    public int hashCode() {
        return 0;
    }
}
