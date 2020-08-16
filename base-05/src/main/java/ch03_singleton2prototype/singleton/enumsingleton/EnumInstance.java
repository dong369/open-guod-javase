package ch03_singleton2prototype.singleton.enumsingleton;

/**
 * 枚举类型单例
 *
 * @author guodd
 * @version 1.0
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
