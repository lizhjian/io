package FileOutputStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 操作图片，这时候用到字节流
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
      // writeFile();
        readFile();
    }
   //写文件
    public  static void writeFile() {
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("fos.txt");
            fos.write(new String("vv").getBytes());

            //没刷新就写入了   字符流需要转换码表 中文===码表===中文
          //  fos.flush();
        }catch (Exception e){
               e.printStackTrace();
        }finally {
            try{
                if(fos!=null){
                    fos.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    //读文件
    public static void readFile(){
        FileInputStream fis = null;
        try{
          fis = new FileInputStream("fos.txt");
          //第一种方法1个1个读
          /* int ch = 0;
          while((ch=fis.read())!=-1){
              System.out.println((char)ch);
          }*/
          //第二种方法用byte数组读
          /*byte [] bytes = new byte[1024];
          int num= 0;
          while((num=fis.read(bytes))!=-1){
              System.out.println(new String(bytes,0,num) );
          }*/
          //第三种方法提前获取数组长度
            byte [] bytes = new byte[fis.available()];

            fis.read(bytes);

            System.out.println("num---"+new String(bytes));
        }catch (Exception e){
          e.printStackTrace();
        }finally {
            try{
                if(fis!=null){
                     fis.close();
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
