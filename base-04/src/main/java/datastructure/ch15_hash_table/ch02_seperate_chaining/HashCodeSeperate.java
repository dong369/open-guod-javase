package datastructure.ch15_hash_table.ch02_seperate_chaining;

import javax.xml.bind.DatatypeConverter;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/10 时间:19:54
 * @JDK 1.8
 * @Description 功能模块：
 * 哈希冲突的处理链地址法
 * Seperate Chaining
 */
public class HashCodeSeperate {
    public static void main(String[] args) {
        byte[] bytes = new byte[0x7fffffff];
        System.out.println(DatatypeConverter.printHexBinary(bytes));
    }
}
