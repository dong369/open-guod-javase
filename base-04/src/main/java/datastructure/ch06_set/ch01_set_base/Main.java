package datastructure.ch06_set.ch01_set_base;

import datastructure.ch06_set.util.FileOperationUtils;

import java.util.ArrayList;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/10 时间:20:28
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Pride and Prejudice");
        ArrayList<String> words1 = new ArrayList<>();
        String path = System.getProperty("user.dir") + "/base-04/src/main/java/datastructure/ch06_set/util/pride-and-prejudice.txt";
        if (FileOperationUtils.readFile(path, words1)) {
            System.out.println("Total words: " + words1.size());
            BSTSet<String> set1 = new BSTSet<>();
            for (String word : words1)
                set1.add(word);
            System.out.println("Total different words: " + set1.getSize());
        }
    }
}
