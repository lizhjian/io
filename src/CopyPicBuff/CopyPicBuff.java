package CopyPicBuff;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Administrator on 2018/3/23.
 */
public class CopyPicBuff {
    public static void main(String[] args) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("1.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("6_copy.png"));
       // byte[] bytes = new byte[1024];
        int num = 0;
        //理解为从缓冲区里面一个一个的拿
        while((num = bis.read())!=-1){
             bos.write(num);
        }
        bis.close();
        bos.close();
    }
}
