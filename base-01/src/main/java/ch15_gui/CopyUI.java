package ch15_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

/**
 * ������
 */
public class CopyUI extends JFrame implements ActionListener {

    private static final long serialVersionUID = 4616387945128671035L;
    //srcFile
    private JLabel lblSrcFile;
    private JTextField tfSrcFile;

    //destDir
    private JLabel lblDestDir;
    private JTextField tfDestDir;

    //destDir
    private JLabel lblCount;
    private JTextField tfCount;
    private JButton btnStart;

    private JProgressBar[] bars;

    public CopyUI() {
        init();
    }

    private void init() {
        this.setTitle("������");
        this.setBounds(100, 100, 800, 600);
        this.setLayout(null);

        //srcFile��ǩ
        lblSrcFile = new JLabel("Դ�ļ�");
        lblSrcFile.setBounds(10, 10, 80, 30);
        this.add(lblSrcFile);

        tfSrcFile = new JTextField();
        tfSrcFile.setText("C:\\Users\\Administrator\\Desktop\\Java������17��\\Java������17��-03.GUI���-�������-�˵�.avi");
        tfSrcFile.setBounds(80, 10, 600, 30);
        this.add(tfSrcFile);

        //destDir��ǩ
        lblDestDir = new JLabel("Ŀ��Ŀ¼");
        lblDestDir.setBounds(10, 60, 80, 30);
        this.add(lblDestDir);

        tfDestDir = new JTextField();
        tfDestDir.setBounds(80, 60, 600, 30);
        tfDestDir.setText("e:/a.avi");
        this.add(tfDestDir);

        //�߳���
        lblCount = new JLabel("�߳���");
        lblCount.setBounds(10, 110, 80, 30);
        this.add(lblCount);

        tfCount = new JTextField();
        tfCount.setBounds(80, 110, 600, 30);
        tfCount.setText("" + 5);
        this.add(tfCount);

        //��ʼ��ť
        btnStart = new JButton("��ʼ");
        btnStart.setBounds(10, 160, 100, 30);
        this.add(btnStart);
        btnStart.addActionListener(this);

        this.setVisible(true);
        //���ô���������
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(-1);
            }
        });
    }

    //��Ӱ�ť����
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //��ʼ��ť
        if (source == btnStart) {
            String srcFile = tfSrcFile.getText();
            String destDir = tfDestDir.getText();
            int count = Integer.parseInt(tfCount.getText());
            //��������������
            Copier copier = new Copier(this, srcFile, destDir, count);

            //��̬��ӽ�����
            addBars(copier.infos);
            //��ʼ����
            copier.startCopy();
        }
    }

    /**
     * ��̬��ӽ�����
     */
    int yOffset = 200;

    private void addBars(List<CopyInfo> infos) {
        bars = new JProgressBar[infos.size()];

        for (CopyInfo info : infos) {
            bars[info.getIndex()] = new JProgressBar();
            bars[info.getIndex()].setBounds(10, 200 + info.getIndex() * 53, 650, 50);
            bars[info.getIndex()].setMaximum(info.getEnd() - info.getStart() + 1);
            this.add(bars[info.getIndex()]);
        }
        this.repaint();
    }

    /**
     * ���½�����
     */
    private int completeCount = 0;

    public void updateBar(int index, int length) {
        bars[index].setValue(bars[index].getValue() + length);
        //
        if (bars[index].getValue() >= bars[index].getMaximum()) {
            completeCount++;
            processFinish();

        }
    }

    /**
     *
     */
    private synchronized void processFinish() {
        if (completeCount >= bars.length) {
            //ɾ��������
            for (JProgressBar bar : bars) {
                this.remove(bar);
            }
            this.repaint();
        }
    }
}
