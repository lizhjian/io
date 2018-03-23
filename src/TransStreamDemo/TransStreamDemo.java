package TransStreamDemo;

import java.io.*;

//转换流

/**
 * 想改进变成一次读一行的模式   readLine   system.in  out 都是字节流 想办法包装成字符流进行操作
 */
public class TransStreamDemo {
    public static void main(String[] args) throws Exception {
       //获取键盘录入对象(字节流)
        InputStream in = System.in;
        //将字节流对象转成字符流对象，使用转换流 InputStreamReader
        InputStreamReader isr = new InputStreamReader(in);

        //为了提高效率，将字符流进行缓冲技术高效操作，使用bufferedReader
        BufferedReader bufr = new BufferedReader(isr);


        OutputStream out = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(out);

        //键盘录入最常见写法
        BufferedWriter bufw = new BufferedWriter(osw);


        String line = null;
        while((line=bufr.readLine())!=null){
            if("over".equals(line))
                break;
           // System.out.println(line.toUpperCase());
            bufw.write(line.toUpperCase());
            bufw.newLine();
            bufw.flush();
        }
        bufr.close();
    }
}
