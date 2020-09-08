package ch03_oothinking.equals;

/**
 * HashCode被设计用来[提高性能]。
 * 如果两个对象相等(equal)，那么他们一定有相同的哈希值；如果两个对象的哈希值相同，但他们未必相等(equal)。
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class HashCodeUse {
    @Override
    public int hashCode() {
        return 0;
    }
}
