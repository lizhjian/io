package CopyBuff;

import java.io.*;

public class CopyBuff {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        copy_1();
        long end = System.currentTimeMillis();
        System.out.println((end-start)+"毫秒");
    }

    //通过字节流的缓冲区完成复制
    public static void copy_1() throws IOException {
        BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("1.png"));
        BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("5_copy.png"));
        int by = 0;
        //解释，read是从缓冲区中读取
        while ((by = bufis.read())!=-1){
            System.out.println(by);
            bufos.write(by);
        }
        bufis.close();
        bufos.close();
       }

}
