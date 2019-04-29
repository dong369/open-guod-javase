package ch07_proxy.base02.compiler;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/4 时间:9:15
 * @JDK 1.8
 * @Description 功能模块：jdk1.6 JavaCompiler API；CGLib；Java ASM
 */
public class TestMain02 {
    public static void main(String[] args) {
        JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
        System.out.println(systemJavaCompiler);
    }
}
