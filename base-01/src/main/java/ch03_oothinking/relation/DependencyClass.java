package ch03_oothinking.relation;

/**
 * 依赖(Dependency)
 * 举例：人依赖船过河，依赖关系仅仅描述了类与类之间的一种使用与被使用的关系。
 * 体现：在Java和C++中体现为局部变量、方法/函数的参数或者是对静态方法的调用。
 * UML：虚线 + 箭头（Person----->Boat）
 * 箭头方向：箭头指向被依赖的类的对象;
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class DependencyClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.crossRiver(new Boat());
        person.fishing(new Boat());
        person.patrol(new Boat());
    }
}

// 人
class Person {

    public void crossRiver(Boat boat) {
        boat.row();
    }

    public void fishing(Boat boat) {
        boat.row();
    }

    public void patrol(Boat boat) {
        boat.row();
    }

}

// 船
class Boat {
    public void row() {
        System.out.println("过河");
    }
}