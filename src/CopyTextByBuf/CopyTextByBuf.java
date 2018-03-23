package CopyTextByBuf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 通过缓冲区赋值一个.java文件
 */
public class CopyTextByBuf {
    public static void main(String[] args) {
        BufferedReader bufr = null;
        BufferedWriter bufw = null;
        try{
            bufr = new BufferedReader(new FileReader("buf.txt"));
            bufw = new BufferedWriter(new FileWriter("buf_copy.txt"));
            String line = null;
            while ((line=bufr.readLine())!=null){
                bufw.write(line);
                bufw.newLine();
                bufw.flush();
            }
        }catch (Exception e){
          throw  new RuntimeException("读写失败");
            //  e.printStackTrace();
        }finally {
            try{
                if(bufw!=null){
                    bufw.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            try{
                if(bufr!=null){
                    bufr.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
