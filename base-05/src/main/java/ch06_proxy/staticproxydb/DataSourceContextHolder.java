package ch06_proxy.staticproxydb;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDbType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDbType() {
        return CONTEXT_HOLDER.get();
    }

    public static void clearDbType() {
        CONTEXT_HOLDER.remove();
    }
}
