package FileReaderDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 文件读
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        //创建一个文件读取流对象，和指定名称的文件相关联要保证该文件是已经存在的
        //如果不存在，会发生异常，这个异常是FileNotFoundException异常
        FileReader fileReader = null;
        try{
            fileReader = new FileReader("demo.txt");
            int ch =0 ;
            while((ch=fileReader.read())!=-1){
                System.out.println("ch="+(char)ch);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }


    }
}
