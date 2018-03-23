package BufferedReaderDemo;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 字符读取缓冲区
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try{
            fileReader = new FileReader("buf.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int num = 0;
            char [] ch = new char[1024];
            while((num=bufferedReader.read(ch))!=-1){
                System.out.println(new String(ch,0,num));
            }
        }catch (Exception e){

        }



    }
}
