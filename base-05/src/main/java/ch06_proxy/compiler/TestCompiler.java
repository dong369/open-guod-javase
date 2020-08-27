package ch06_proxy.compiler;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * jdk1.6 JavaCompiler API；CGLib ASM直接生成class的二进制码
 */
public class TestCompiler {
    public static void main(String[] args) {
        JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
        System.out.println(systemJavaCompiler);
    }
}
