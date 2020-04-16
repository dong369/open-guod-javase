package ch03_oothinking.createobject;

import ch03_oothinking.serialversionuid.SerialVersionUID;
import org.springframework.util.SerializationUtils;

import java.lang.reflect.Constructor;

/**
 * 创建对象的方式
 * 一个对象引用可以指向 0 个或 1 个对象（一根绳子可以不系气球，也可以系一个气球）;
 * 一个对象可以有 n 个引用指向它（可以用 n 条绳子系住一个气球）
 *
 * @author guodd
 * @version 1.0
 */
public class CreateObject {
    public static void main(String[] args) throws Exception {
        // 01使用new关键字
        SerialVersionUID serialVersionUID = new SerialVersionUID();
        // 02使用Class类的newInstance方法
        SerialVersionUID o = (SerialVersionUID) Class.forName("ch03_oothinking.serialversionuid.SerialVersionUID").newInstance();
        // 03使用Constructor类的newInstance方法
        Constructor<SerialVersionUID> constructor = SerialVersionUID.class.getConstructor();
        SerialVersionUID serialVersion = constructor.newInstance();
        // 04使用clone方法
        SerialVersionUID cloneObject = (SerialVersionUID) serialVersionUID.clone();
        // 05使用序列化/反序列化
        byte[] serialize = SerializationUtils.serialize(new SerialVersionUID());
        SerialVersionUID deserialize = (SerialVersionUID) SerializationUtils.deserialize(serialize);
        System.out.println(deserialize);
    }
}