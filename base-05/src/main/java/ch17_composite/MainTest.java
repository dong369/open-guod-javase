package ch17_composite;

/**
 * 组合模式(Composite Pattern)
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/12/28 时间:9:53
 * @since 1.8
 */
public class MainTest {
    public static void main(String[] args) {
        CatalogComponent count01 = new Course("Linux课程", 45.6);
        CatalogComponent count02 = new Course("Windows课程", 45.6);

        CatalogComponent catalog01 = new CourseCatalog("主课程", 1);
        CatalogComponent catalog02 = new CourseCatalog("Java课程目录", 2);

        CatalogComponent count03 = new Course("Java基础课程", 45.6);
        catalog02.add(count03);

        catalog01.add(catalog02);
        catalog01.add(count01);
        catalog01.add(count02);
        catalog01.print();

    }
}
