package FileReaderDemo2;

import java.io.FileReader;
import java.io.IOException;

/**
 * 通过字符数组进行读取
 */
public class FileReaderDemo2 {
    public static void main(String[] args) {
        FileReader fileReader =null;
        try{
            fileReader  = new FileReader("demo.txt");
            char[] buf = new char[10];
           // fileReader.read(buf)
           /*int num = fileReader.read(buf);
            System.out.println(buf);*/
           int num= 0;
           while((num=fileReader.read(buf))!=-1){
               System.out.println(new String(buf,0,num));
           }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(fileReader!=null){
                    fileReader.close();
                }

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
