package ch02_data.generic.useinterface;

/**
 * 接口泛型
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/6 时间:13:10
 * @since 1.8
 */
public class Car<T> implements GenericInterface<T> {
    @Override
    public void print(T t) {
        System.out.println("print:" + t);
    }

    @Override
    public void show(String t) {

    }
}
