package jdk.jdk8.stream;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Java 8中的Stream是对集合（Collection）对象功能的增强，Collection中扩展了两个方法：stream()顺序流、parallelStream()并行流。
 * 它专注于对集合对象进行各种非常便利、高效的聚合操作（aggregate operation），或者大批量数据操作 (bulk data operation)。
 * Stream API借助于同样新出现的Lambda表达式，极大的提高编程效率和程序可读性。
 * Stream关注的是对数据的运算，与CPU打交道，集合关注的是数据的存储，与内存打交道！
 * 执行流程：实例化stream；中间操作；终止操作
 * 注意：一个中间操作链，对数据源的数据进行处理，一旦执行终止操作，就执行中间操作链，并产生结果，之后不能被使用！！！
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class StreamMain01 {
    @Test
    public void type01() throws Exception {
        // 方式一：通过集合
        List<Integer> asList = Arrays.asList(1, 6, 2, 4);
        // 顺序流
        Stream<Integer> stream = asList.stream();
        stream.sorted(Integer::compareTo).forEach(System.out::println);
        // 并行流
        Stream<Integer> integerStream = asList.parallelStream();
        integerStream.sorted(Integer::compareTo).forEach(System.out::println);

        // 方式二：通过Arrays工具列
        int[] a = {1, 2, 3};
        IntStream stream1 = Arrays.stream(a);
        stream1.forEach(System.out::println);

        // 方式三：stream静态方法of()
        Stream<String> java = Stream.of("java", "javascript");
        List<String> collect = Stream.of("java", "javascript").collect(Collectors.toList());
        collect.forEach(System.out::println);

        // 方式四：创建无限流（造数据）
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        // 方式五：通过缓冲流
        BufferedReader br = new BufferedReader(new FileReader(new File("d:/test/test.txt")));
        Stream<String> lines = br.lines();
        lines.forEach(System.out::println);

        // 方式六：NIO
        Stream<String> linesStr = Files.lines(Paths.get("d:/test/test.txt"));
        linesStr.forEach(System.out::println);
    }
}
