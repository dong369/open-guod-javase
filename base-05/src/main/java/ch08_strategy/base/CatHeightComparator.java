package ch08_strategy.base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class CatHeightComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Cat cat1 = (Cat) o1;
        Cat cat2 = (Cat) o2;
        if (cat1.getHeight() > cat2.getHeight())
            return 1;
        else if (cat1.getHeight() < cat2.getHeight())
            return -1;
        return 0;
    }
}
