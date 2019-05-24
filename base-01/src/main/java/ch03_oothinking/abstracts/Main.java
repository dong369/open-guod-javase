package ch03_oothinking.abstracts;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/5/24 时间:14:52
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Main extends AbstractClass {
    @Override
    public void say() {
        System.out.println("say");
    }

    public Main(AbstractClass abstractClass) {
        System.out.println("doTest");
    }


    public static void main(String[] args) {
        new Main(new AbstractClass() {
            @Override
            public void say() {
                System.out.println();
            }
        });
    }
}
