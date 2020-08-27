package ch08_strategy.base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class Cat implements Comparable {
    private int height;
    private int weigh;

    private Comparator comparator = new CatHeightComparator();

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    @Override
    public int compareTo(Object o) {
        return comparator.compare(this, o);
    }
}
