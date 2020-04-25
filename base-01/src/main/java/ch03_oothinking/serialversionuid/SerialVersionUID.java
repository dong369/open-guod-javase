package ch03_oothinking.serialversionuid;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author guodd
 * @version 1.0
 */
@Setter
@Getter
public class SerialVersionUID implements Serializable, Cloneable {
    private static final long serialVersionUID = 6297167897982172781L;
    /**
     * 属性描述：姓名
     */
    private String name;

    /**
     * 功能描述：年龄
     */
    private Integer age;

    @Override
    public String toString() {
        return "Employee [name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        SerialVersionUID other = (SerialVersionUID) obj;
        if (name == null) {
            return other.name == null;
        } else return name.equals(other.name);
    }

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
