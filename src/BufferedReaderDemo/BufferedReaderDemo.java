package BufferedReaderDemo;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 字符读取缓冲区
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader("buf.txt");
            bufferedReader = new BufferedReader(fileReader);
            /*int num = 0;
            char [] ch = new char[1024];
            while((num=bufferedReader.read(ch))!=-1){
                System.out.println(new String(ch,0,num));
            }*/
            //按照行的方式进行读取
            String line = null;
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
           // String s1 = bufferedReader.readLine();

        }catch (Exception e){
          try{
              if(bufferedReader!=null){
                  bufferedReader.close();
              }
          }catch (Exception e1){
              e1.printStackTrace();
          }
        }



    }
}
