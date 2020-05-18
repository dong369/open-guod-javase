package ch15_gui;

import java.io.RandomAccessFile;

/**
 * �����߳�
 */
public class CopyThread extends Thread {
    private CopyUI copyui;
    private CopyInfo info;

    public CopyThread(CopyUI copyui, CopyInfo info) {
        this.copyui = copyui;
        this.info = info;
    }

    public void run() {
        try {
            //��λԴ�ļ�
            RandomAccessFile src = new RandomAccessFile(info.getSrcFile(), "r");
            src.seek(info.getStart());
            //��λĿ���ļ�
            RandomAccessFile dest = new RandomAccessFile(info.getDestDir(), "rw");
            dest.seek(info.getStart());

            byte[] buffer = new byte[1024];
            //���㸴����
            int amount = info.getEnd() - info.getStart() + 1;
            //
            int loopNum = 0;
            //ʣ����
            int remain = amount % buffer.length;

            if (remain == 0) {
                loopNum = amount / buffer.length;
            } else {
                loopNum = amount / buffer.length + 1;
            }

            for (int i = 0; i < loopNum; i++) {
                //�������һ��
                if (i != (loopNum - 1)) {
                    src.read(buffer);
                    dest.write(buffer);
                    copyui.updateBar(info.getIndex(), buffer.length);
                } else {
                    byte[] buffer0 = null;
                    if (remain == 0) {
                        buffer0 = buffer;
                    } else {
                        buffer0 = new byte[remain];
                    }
                    src.read(buffer0);
                    dest.write(buffer0);
                    copyui.updateBar(info.getIndex(), buffer0.length);
                }
            }
            src.close();
            dest.close();
        } catch (Exception e) {
        }
    }
}
