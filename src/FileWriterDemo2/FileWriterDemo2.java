package FileWriterDemo2;

import java.io.FileWriter;
import java.io.IOException;

/**
 * IO异常
 */
public class FileWriterDemo2 {
    public static void main(String[] args) {
        FileWriter fw =null;
        try{
            fw = new FileWriter("K:\\demo1.txt");
            fw.write("aaaaa");

        }catch (IOException e){
          //  System.out.println(e.toString());
            e.printStackTrace();
        }finally {
            try{
                if(fw!=null){
                    fw.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
