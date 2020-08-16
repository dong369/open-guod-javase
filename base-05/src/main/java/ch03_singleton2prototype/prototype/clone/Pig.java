package ch03_singleton2prototype.prototype.clone;


import java.util.Date;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class Pig implements Cloneable{
    /**
     * 属性描述：name
     */
    private String name;

    /**
     * 属性描述：dateTime
     */
    private Date dateTime;

    public Pig() {
    }

    public Pig(String name, Date dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig clone = (Pig) super.clone();
        // 进行深克隆
        clone.dateTime= (Date) clone.dateTime.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Pig{" +
               "name='" + name + '\'' +
               ", dateTime=" + dateTime +
               '}'+super.toString();
    }
}
