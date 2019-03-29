package ch07_proxy.base02.compiler;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
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
 * @Description 功能模块：如何编译：jdk1.6 compiler API；CGLib；ASM
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
        // 01、compile（编译）
        System.out.println(System.getProperty("user.dir"));
        // 获取Java默认的编译器，其实是javac
        JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
        System.out.println(javaCompiler.getClass().getName());
        StandardJavaFileManager fileManager = javaCompiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> javaFileObjects = fileManager.getJavaFileObjects(new File(""));
        JavaCompiler.CompilationTask task = javaCompiler.getTask(null, fileManager, null, null, null, javaFileObjects);
        task.call();
        fileManager.close();
        // load into memory（加载到内存）
        URL[] urls = new URL[]{new URL("file:/" + System.getProperty("user.dir"))};
        URLClassLoader urlClassLoader = new URLClassLoader(urls);
        Class<?> aClass = urlClassLoader.loadClass("");
        // create a instance（实例化对象）
        Constructor<?> constructor = aClass.getConstructor();
        constructor.newInstance();
    }
}