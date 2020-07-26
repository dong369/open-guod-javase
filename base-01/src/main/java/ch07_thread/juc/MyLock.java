package ch07_thread.juc;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * {@link ReentrantLock}
 *
 * @author guodd
 * @version 1.0
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

    @Test
    public void main() {
        MyLock myLock = new MyLock();
//        myLock.setName("");
//        myLock.setAge(0);
    }
}
