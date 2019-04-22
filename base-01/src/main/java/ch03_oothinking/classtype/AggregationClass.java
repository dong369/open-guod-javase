package ch03_oothinking.classtype;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/12/28 时间:9:18
 * @JDK 1.8
 * @Description 功能模块：聚合(aggregation)
 * 举例：班级和学生，当班级删除之后，学生还是存在，学生还可能被培训机构引用
 * 体现：C++中,聚合关系通过将被聚合者的（数组）指针作为内部成员来实现的
 * UML：空心菱形 + 实线 + 箭头（Classes—>Students）
 * 箭头：箭头指向代表个体/部分的对象,也就是被合成/组合的类的对象;
 */
public class AggregationClass {
    public static void main(String[] args) {
        Classes classes = new Classes(new Students());
        System.out.println(classes);
    }
}

class Classes {
    private Students student;

    public Classes(Students students) {
        this.student = students;
    }
}

class Students {
    public void learn() {
        System.out.println("学习");
    }
}