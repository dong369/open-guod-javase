package ch06_io.zip;

import java.io.*;
import java.util.Enumeration;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class ZipFileUse {
    public void unzip() {
        //targetPath输出文件路径
        File targetFile = new File("targetPath");
        // 如果目录不存在，则创建
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        //sourcePath压缩包文件路径
        try (ZipFile zipFile = new ZipFile(new File("sourcePath"))) {
            System.out.println("file nums:" + zipFile.size());
            Enumeration enumeration = zipFile.entries();
            while (enumeration.hasMoreElements()) {
                //依次获取压缩包内的文件实体对象
                ZipEntry entry = (ZipEntry) enumeration.nextElement();
                System.out.println("this file size:" + entry.getSize());
                String name = entry.getName();
                if (entry.isDirectory()) {
                    continue;
                }
                try (BufferedInputStream inputStream = new BufferedInputStream(zipFile.getInputStream(entry))) {
                    // 需要判断文件所在的目录是否存在，处理压缩包里面有文件夹的情况
                    String outName = "targetPath" + "/" + name;
                    File outFile = new File(outName);
                    File tempFile = new File(outName.substring(0, outName.lastIndexOf("/")));
                    if (!tempFile.exists()) {
                        tempFile.mkdirs();
                    }
                    try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outFile))) {
                        int len;
                        byte[] buffer = new byte[1024];
                        while ((len = inputStream.read(buffer)) > 0) {
                            outputStream.write(buffer, 0, len);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void unzipInputStream() {
        try (ZipInputStream zip = new ZipInputStream(new FileInputStream(new File("sourceFilePath")))) {
            ZipEntry zipEntry = null;
            while ((zipEntry = zip.getNextEntry()) != null) {
                String fileName_zip = zipEntry.getName();
                System.out.println(fileName_zip);
                File file = new File("/targetPath/" + fileName_zip);
                if (fileName_zip.endsWith("/")) {
                    file.mkdir();
                } else {
                    BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file));
                    byte[] byte_s = new byte[1024];
                    int num;
                    while ((num = zip.read(byte_s, 0, byte_s.length)) > 0) {
                        outputStream.write(byte_s, 0, num);
                    }
                    outputStream.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void zip(Map<String, File> map) {
        //targetFilePath为导出文件路径，e.g.:/tmp/test.zip
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(new File("targetFilePath"))))) {
            map.forEach((fileName, file) -> {
                try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
                    //fileName必须带文件扩展名
                    ZipEntry entry = new ZipEntry(fileName);
                    zipOutputStream.putNextEntry(entry);

                    int len;
                    byte[] buffer = new byte[1024];
                    while ((len = inputStream.read(buffer)) > 0) {
                        zipOutputStream.write(buffer, 0, len);
                    }
                } catch (IOException e) {
                    System.out.println("批量文件压缩IO异常");
                    e.printStackTrace();
                }
            });
            zipOutputStream.closeEntry();
        } catch (Exception e) {
            System.out.println("压缩excel文件失败");
            e.printStackTrace();
        }
    }
}
