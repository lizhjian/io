package BufferedWriterDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *缓冲区的出现是为了提高流的操作效率而出现的
 * 所以在创建缓冲区钱，必须要有流对象
 * 该缓冲区中提供一个跨平台的换行符
 * newLine
 */
public class BufferedWriterDemo {
    public static void main(String[] args) {
       //创建一个字符写入流对象
        FileWriter fileWriter = null;
        BufferedWriter buf =null;
        try{
            fileWriter = new FileWriter("buf.txt",true);

            //为了提高字符读写效率，加入缓冲技术，只要将需要被提高效率的流对象作为参数传递给缓冲区的构造函数即可
            buf = new BufferedWriter(fileWriter);
            buf.write("cccc");
            buf.newLine();
            buf.write("ccdddddcc");
            //只要用到缓冲区，就要刷新
            buf.flush();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //其实关闭缓冲区，就是在关闭缓冲区中的流对象
            try {
                if(buf!=null){
                   buf.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
          /*  try {
                if(fileWriter!=null){
                    fileWriter.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }*/
        }

    }
}
