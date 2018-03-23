package CopyPic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 赋值一个图片
 * 1、用字节流读取刘对象和对骗关联。
 * 2、用字节写入流对象创建一个图片文件，用于存储获得取到的图片数据
 * 3、通过循环读写。完成数据的存储
 * 4、关闭资源
 */
public class CopyPic {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try{
            //关联输入  输出流操作不追加就创建新的文件
            fis = new FileInputStream("1.png");
            fos = new FileOutputStream("3_copy.png");
            int num =0;
            byte[] bytes = new byte[1024];
            while((num = fis.read(bytes))!=-1){
                fos.write(bytes,0,num);
            }
        }catch (Exception e){
         //   e.printStackTrace();
           throw  new RuntimeException("复制文件失败");
        }
        finally {
            try{
                if(fis!=null){
                    fis.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            try{
                if(fos!=null){
                    fos.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
}
