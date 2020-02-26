package ch07_thread.juc;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.tools.JavaCompiler;
import java.util.concurrent.locks.ReentrantLock;

/**
 * {@link ReentrantLock}
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:14:50
 * @since JDK1.8
 */
@NoArgsConstructor
@Data
public class MyLock {
    /**
     * name : guo
     * age : 12
     */

    private String name;
    private int age;

    public static void main(String[] args) {
        MyLock myLock = new MyLock();
        myLock.setName("");
        myLock.setAge(0);
    }
}
