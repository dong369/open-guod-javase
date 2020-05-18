package ch15_gui;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 * ������
 */
public class Copier {
    private CopyUI copyui;
    //Դ�ļ�
    private String srcFile;
    //Ŀ��Ŀ¼
    private String destDir;
    //�߳���
    private int count;

    //ÿ���̸߳�����Ϣ�ļ���
    public List<CopyInfo> infos;

    public Copier(CopyUI copyui, String srcFile, String destDir, int count) {
        this.copyui = copyui;
        this.srcFile = srcFile;
        this.destDir = destDir;
        this.count = count;
        //
        initCopyInfos();
    }

    /**
     * ��ʼ��������Ϣ�ļ���
     */
    private void initCopyInfos() {
        try {
            infos = new ArrayList<CopyInfo>();
            //����Դ�ļ���С
            RandomAccessFile raf = new RandomAccessFile(srcFile, "r");
            int fileLength = (int) raf.length();

            //ÿ���̸߳��ƵĿ��С
            int block = fileLength / count;

            int start = 0;
            int end = 0;
            for (int i = 0; i < count; i++) {
                CopyInfo info = new CopyInfo();
                //��������
                info.setIndex(i);
                info.setSrcFile(srcFile);
                info.setDestDir(destDir);

                start = i * block;
                info.setStart(start);
                if (i != (count - 1)) {
                    end = (i + 1) * block - 1;
                } else {
                    end = fileLength - 1;
                }
                info.setEnd(end);
                infos.add(info);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * ��ʼ�����ļ�
     */
    public void startCopy() {
        for (CopyInfo info : infos) {
            new CopyThread(copyui, info).start();
        }
    }
}
