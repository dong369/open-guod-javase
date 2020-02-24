package ch17_composite;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/5 时间:14:44
 * @JDK 1.8
 * @Description 功能模块：目录组件
 */
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("");
    }


    public String getName(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("");
    }

    public Double getPrice(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("");
    }


    public void print() {
        throw new UnsupportedOperationException("");
    }
}
