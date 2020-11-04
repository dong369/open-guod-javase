package ch12_proxy.jdkproxy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;

/**
 * project - 动态代理
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        // 创建委托类对象
        Student student = new Student();
        // 生成代理类对象Proxy.newProxyInstance();
        StudentInterface proxyInstance = (StudentInterface) Proxy.newProxyInstance(
                StudentInterface.class.getClassLoader(),
                new Class[]{StudentInterface.class},
                new StudentProxyHandler(student)
        );
        // 调用代理类的方法
        proxyInstance.study();
        proxyInstance.sleep();
        proxyInstance.play();
        // 代理对象的名字
        System.out.println(proxyInstance.getClass().getName());
        File file = new File("D:/bb.class");
        OutputStream outputStream = new FileOutputStream(file);
        byte[] bytes = ProxyGenerator.generateProxyClass(proxyInstance.getClass().getName(), new Class[]{StudentInterface.class}, Modifier.PUBLIC);
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        outputStream.write(bytes);
    }
}