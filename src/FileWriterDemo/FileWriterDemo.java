package FileWriterDemo;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //1、创建一个FileWriter对象，该对象一被初始化就必须有要被操作的文件
        //而且该文件会被创建到指定的目录下。如果该目录下已有同名文件，将被覆盖
        //其实该步就是明确数据要存放的目的地

        FileWriter fileWriter = new FileWriter("demo.txt");
        //调用writer方法将数据写到流中
        fileWriter.write("sss");
        //强制刷新缓冲
        fileWriter.flush();
        fileWriter.write("aaaaa");
        fileWriter.flush();
        //关闭资源，但是关闭之前会刷新一次内部的缓冲中的数据
        //将数据滑到目的地中
        //和flush的区别：flush刷新后，流可以继续使用，close刷新后，会将流关闭
        fileWriter.close();


        /*try{

        }catch (IOException e){
            e.printStackTrace();
        }*/

    }

}
