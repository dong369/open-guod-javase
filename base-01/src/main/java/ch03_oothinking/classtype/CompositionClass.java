package ch03_oothinking.classtype;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/12/28 时间:9:21
 * @JDK 1.8
 * @Description 功能模块：组合(Composition)
 * 举例：房子和房间的关系，当房子没有了，房间同样不可能单独存在。
 * 体现：在Java和C++中,组合关系是通过成员变量来实现的。
 * UML：实心菱形 + 实线 + 箭头（Room—>House）
 * 箭头：箭头指向代表个体/部分的对象,也就是被合成/组合的类的对象;
 */
public class CompositionClass {
    public static void main(String[] args) {
        Room room = new Room();
        room.createRoom();
    }

}

class Room {
    public Room createRoom() {
        System.out.println("创建房间");
        return new Room();
    }
}

class House {
    private Room room;

    public House() {
        room = new Room();
    }

    public void createHouse() {
        room.createRoom();
    }

}
