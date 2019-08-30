package ch04_proxy.dynamicproxy.compiler;

import ch04_proxy.dynamicproxy.Movable;
import ch04_proxy.dynamicproxy.Taken;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * project - 代理模式
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/9/11 时间:21:58
 * @JDK 1.8
 * @Description 功能模块：如何编译：jdk1.6 JavaCompiler API；CGLib；Java ASM
 */
public class TestMain01 {
    public static void main(String[] args) throws Exception {
        String src = "package ch04_proxy.dynamicproxy;\n" +
                "public class TakenLogProxy implements Movable {\n" +
                "    public TakenLogProxy(Movable taken) {\n" +
                "        super();\n" +
                "        this.taken = taken;\n" +
                "    }\n" +
                "\n" +
                "    Movable taken;\n" +
                "\n" +
                "    @Override\n" +
                "    public void move() throws InterruptedException {\n" +
                "        System.out.println(\"logger start\");\n" +
                "        taken.move();\n" +
                "        System.out.println(\"logger end\");\n" +
                "    }\n" +
                "}";
        String fileName = System.getProperty("user.dir") + "/base-05/src/main/java/ch04_proxy/dynamicproxy/TakenLogProxy.java";
        File file = new File(fileName);
        FileWriter fw = new FileWriter(file);
        fw.write(src);
        fw.flush();
        fw.close();
        // Compiler编译运行工具
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        System.out.println(compiler.getClass().getName());
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> units = fileManager.getJavaFileObjects(fileName);
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);
        task.call();
        fileManager.close();
        // load into memory（加载到内存）
        URL[] urls = new URL[]{new URL("file:/" + System.getProperty("user.dir") + "/base-05/src/main/java/")};
        URLClassLoader urlClassLoader = new URLClassLoader(urls);
        Class<?> aClass = urlClassLoader.loadClass("ch04_proxy.dynamicproxy.TakenLogProxy");
        System.out.println(aClass);
        // create a instance（实例化对象）
        Constructor<?> constructor = aClass.getConstructor(Movable.class);
        Movable m = (Movable) constructor.newInstance(new Taken());
        m.move();
    }
}