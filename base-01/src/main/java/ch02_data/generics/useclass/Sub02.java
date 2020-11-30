package ch02_data.generics.useclass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by guodd
 * @version 1.0
 * @since 1.8
 */
public class Sub02<T> extends GenericClass<T> {
    private List<?> subList = new ArrayList<>();

    public List<?> getSubList() {
        return subList;
    }

    public void setSubList(List<?> subList) {
        this.subList = subList;
    }

    public Sub02() {
    }

    public Sub02(int i) {
    }

}
