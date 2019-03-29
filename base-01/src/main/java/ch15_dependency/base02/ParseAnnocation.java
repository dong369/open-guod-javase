package ch15_dependency.base02;

import java.lang.reflect.Field;

/**
 * project - 注解
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/31 时间:13:11
 * @JDK 1.8
 * @Description 功能模块：注解的提取解析
 */
public class ParseAnnocation {
    public static void parseAnnocation(Object object) throws Exception {
        //1.获取字节码文件
        Class c = object.getClass();
        //2.获取成员变量
        Field[] fields = c.getFields();
        //3.遍历成员变量
        for (Field field : fields) {
            // 4. 找到带有StringAnnotation注解的成员变量
            if (field.isAnnotationPresent(StringAnnotation.class)) {
                StringAnnotation annotation = field.getAnnotation(StringAnnotation.class);
                //5. 获取注解中的值
                String value = annotation.value();
                // 6. 为成员变量赋值
                field.set(object, value);
            }
        }
    }
}
