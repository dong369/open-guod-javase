package ch01_helloworld;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import lombok.extern.slf4j.Slf4j;

/**
 * 调用局域网打印机，打印word文档
 *
 * @author guodd
 */
@Slf4j
public class PrintWord {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String path = "D:\\aa.doc";
        ComThread.InitSTA();
        ActiveXComponent word = new ActiveXComponent("Word.Application");
        Dispatch doc = null;
        Dispatch.put(word, "Visible", new Variant(false));
        Dispatch docs = word.getProperty("Documents").toDispatch();
        doc = Dispatch.call(docs, "Open", path).toDispatch();
        try {
            Dispatch.call(doc, "PrintOut");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (doc != null) {
                    Dispatch.call(doc, "Close", new Variant(0));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            ComThread.Release();
        }
    }
}
