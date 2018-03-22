package FileWriterDemo3;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo3 {
    public static void main(String[] args) {
        //传递一个true参数，代表不覆盖已有的文件，并在已有的文件末尾处进行续写
        FileWriter fileWriter = null;
        try{
          fileWriter =   new FileWriter("demo.txt",true);
          fileWriter.write("nihaoxiexie\nzzzzz");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(fileWriter!=null){
                    fileWriter.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }



    }
}
