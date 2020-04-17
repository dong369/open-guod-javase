package ch07_thread.threadlocal;

/**
 * The class/interface
 * {@link ThreadLocal}
 * {@link java.lang.ThreadLocal.ThreadLocalMap}
 * ThreadLocal可以理解成是线程级别的本地变量，传统的线程对一个变量操作时操作的是同一个对象，也存在线程安全问题。
 * ThreadLocal是一个变量的本地副本，线程对变量的操作不会影像其它线程。
 * 使用场景：数据库连接管理；Session管理
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class ThreadLocalUse {
    private static final ThreadLocal<User> tl1 = new ThreadLocal<>();

    private static final ThreadLocal<User> tl2 = new ThreadLocal<User>() {
    };

    private static final ThreadLocal<User> tl3 = ThreadLocal.withInitial(User::new);

    private final static ThreadLocal<User> users = ThreadLocal.withInitial(() -> new User("guo", 26));

    // 每一个线程都使用自己的线程变量副本，并不影响其它线程和主线程，实现了线程的隔离效果
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 3; i++) {
            new ThreadUse().start();
        }
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + users.get());
    }

    static class ThreadUse extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                User user = users.get();
                user.setName(Thread.currentThread().getName());
                user.setAge(i + 1);
                users.set(user);
                System.out.println(users.get());
            }
        }
    }
}
