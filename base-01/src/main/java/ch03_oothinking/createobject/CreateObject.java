package ch03_oothinking.createobject;

import ch02_data.serialversionuid.SerialVersionUID;
import org.springframework.util.SerializationUtils;

import javax.xml.bind.DatatypeConverter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/24 时间:10:09
 * @JDK 1.8
 * @Description 功能模块：创建对象的五种方式
 */
public class CreateObject {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 01使用new关键字
        SerialVersionUID serialVersionUID = new SerialVersionUID();
        // 02使用Class类的newInstance方法
        SerialVersionUID o = (SerialVersionUID) Class.forName("ch02_data.serialversionuid.SerialVersionUID").newInstance();
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