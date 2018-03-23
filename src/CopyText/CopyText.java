package CopyText;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 将C盘下文件 存储到D盘
 *1、D创建一个文件，用于存储C盘文件中的数据
 *2、定义读取流和C盘文件关联
 *3、通过不断的读写完成数据存储
 * 4、关闭资源
 */

public class CopyText {
    public static void main(String[] args) throws Exception {
        //copy_1();
        copy_2();
    }

    //从c盘读一个就往D盘写一个
    public static void   copy_1() throws  Exception{
        //创建目的地
        FileWriter fileWriter = new FileWriter("demo1_copy.txt");
        FileReader fileReader = new FileReader("demo1.txt");
        int ch=0;
        while ((ch=fileReader.read())!=-1){
             fileWriter.write(ch);
        }
        fileWriter.close();
        fileReader.close();

    }
    //从c盘读一个就往D盘写一个
    public static void   copy_2() throws  Exception{
        //创建目的地
        FileWriter fileWriter = new FileWriter("demo2_copy.txt");
        FileReader fileReader = new FileReader("demo1.txt");
        int num=0;
        char [] buf = new char[1024];
        while ((num=fileReader.read(buf))!=-1){
             fileWriter.write(buf,0,num);
        }

        fileWriter.close();
        fileReader.close();

    }
}
