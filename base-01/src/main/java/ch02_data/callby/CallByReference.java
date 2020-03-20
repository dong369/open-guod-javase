package ch02_data.callby;

/**
 * 引用调用
 * 1）student变量被初始化为user值的拷贝，这里是一个对象的引用。
 * 2）调用student变量的set方法作用在这个引用对象上，user和student同时引用的User对象内部值被修改。
 * 3）方法结束后，student变量不再使用，被释放，而user还是没有变，依然指向User对象。
 * 结论：当传递方法参数类型为引用数据类型时，一个方法将修改一个引用数据类型的参数所指向对象的值。
 */
public class CallByReference {
    public static void main(String[] args) {
        User user = new User("guo", 26);
        System.out.println("调用前user的值：" + user.toString());
        updateUser(user);
        System.out.println("调用后user的值：" + user.toString());
    }

    private static void updateUser(User student) {
        student.setName("sun");
        student.setAge(18);
    }
}
