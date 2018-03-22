package FileReaderTest;

import java.io.FileReader;

/**
 * 读取一个java文件
 */
public class FileReaderTest {
    public static void main(String[] args) throws Exception{
        FileReader fileReader = new FileReader("demo.txt");
        char [] buf = new char[1024];
        int num = 0;
        while ((num=fileReader.read(buf))!=-1){
            System.out.println(new String(buf,0,num));
        }
        fileReader.close();
    }
}
