package ch07_thread.sync;

import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class SyncMain {
    // JVM是一个标准规范
    // HotSpot是一个具体产品/实现；其它虚拟机J9、taoBaoVM
    // openJDK是一个项目/代码/C++开发的，就是HotSpot的开源部分，HotSpot是基于openJDK开发的
    // Oracle JDK（hotspot）版本将每六个月发布一次，而OpenJDK版本每三个月发布一次；
    @Test
    public void vmInfo() {
        System.out.println(VM.current().details());
    }

    // Java对象的布局（模板信息）
    @Test
    public void classLayout() {
        // 大端存储/小端存储，如果是小端存储需要倒着看
        A a = new A();
        System.out.println(Integer.toHexString(a.hashCode()));
        System.out.println(ClassLayout.parseInstance(a).toPrintable());

        Integer[] b = {1, 2};
        System.out.println(ClassLayout.parseInstance(b).toPrintable());
    }

    private Lin lin;

    public void syncThis() {
        synchronized (this) {
        }
    }

    public void syncClass() {
        synchronized (Lin.class) {

        }
    }

    // 锁对象
    public void syncObj(A lin) {
        synchronized (lin) {
            System.out.println(ClassLayout.parseInstance(lin).toPrintable());
        }
    }

    public void countHash(Object o) throws Exception {
        Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        Unsafe unsafe = (Unsafe) theUnsafe.get(null);
        long hashCode = 0;
        for (int i = 0; i < 7; i++) {
            hashCode |= (unsafe.getByte(o, i) & 0xFF) << ((i - 1) * 8);
        }
        String code = Long.toHexString(hashCode);
        System.out.println(code);
    }
}