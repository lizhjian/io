package TransStreamDemo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

//转换流
public class TransStreamDemo {
    public static void main(String[] args) throws Exception {
       //获取键盘录入对象
        InputStream in = System.in;
        //将字节流对象转成字符流对象，使用转换流 InputStreamReader
        InputStreamReader isr = new InputStreamReader(in);
        //为了提高效率，将字符流进行缓冲技术高效操作，使用bufferedReader
        BufferedReader bufr = new BufferedReader(isr);
        String line = null;
        while((line=bufr.readLine())!=null){
            if("over".equals(line))
                break;
            System.out.println(line.toUpperCase());
        }
        bufr.close();
    }
}
