package ch01_helloworld;

import lombok.extern.slf4j.Slf4j;

import javax.print.*;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
@Slf4j
public class PrintWz {
    public static void printPdf(String fileName) {
        //构造一个文件选择器，默认为当前目录
        File file = new File(fileName);//获取选择的文件
        //构建打印请求属性集
        PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
        //设置打印格式，因为未确定文件类型，这里选择AUTOSENSE
        DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
        //查找所有的可用打印服务
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(flavor, pras);
        System.out.println(Arrays.toString(printServices));
        //定位默认的打印服务
        PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService();
        // 显示打印对话框
        try {
            DocPrintJob job = defaultService.createPrintJob(); // 创建打印作业
            FileInputStream fis; // 构造待打印的文件流
            fis = new FileInputStream(file);
            DocAttributeSet das = new HashDocAttributeSet();
            Doc doc = new SimpleDoc(fis, flavor, das);
            job.print(doc, pras);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过本机默认打印机打印pdf文件
     * @param filePath 文件路径
     * @throws Exception
     */
    public static void defaultPrintPDF(String filePath) throws Exception{
//        log.info("打印工具类入參：filePath==================="+filePath);
        File file = new File(filePath); // 获取选择的文件
        // 构建打印请求属性集
        HashPrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
        // 设置打印格式，因为未确定类型，所以选择autosense
        DocFlavor flavor = DocFlavor.INPUT_STREAM.PDF;
//        log.info("打印文件类型为：==================="+flavor);
        // 定位默认的打印服务
        PrintService defaultService = PrintServiceLookup
                .lookupDefaultPrintService();
//        log.info("打印工具选择打印机为：==================="+defaultService);
        try {
            DocPrintJob job = defaultService.createPrintJob(); // 创建打印作业
            FileInputStream fis = new FileInputStream(file); // 构造待打印的文件流
            DocAttributeSet das = new HashDocAttributeSet();
            Doc doc = new SimpleDoc(fis, flavor, das);
            job.print(doc, pras);
        } catch (Exception e) {
            e.printStackTrace();
//            log.info("打印异常",e);
            throw new Exception();
        }
    }

    public static void main(String[] args) throws Exception {
        printPdf("d:/aa.pdf");
        defaultPrintPDF("d:/aa.pdf");
    }
}
