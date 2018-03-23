# java IO

### IO原理及流的分类
 #### 基类
 * 字节流的抽象基类
   * InputStream 
   * OutputStream
 * 字节流的抽象基类
   * Reader
   * Writer
 #### 子类     
 * 文件流
   * FileInputStream
      ```
      //关联操作
      fis = new FileInputStream("1.png");
 
      ```
   * FileOutputStream
   ```
   //生成文件，若重载true 则取代原有的文件，否则取代
   fos = new FileOutputStream("3_copy.png");
   ```
   * FileReader
   ```
   //通过字符流方式一个一个复制
   FileWriter fileWriter = new FileWriter("demo1_copy.txt");
           FileReader fileReader = new FileReader("demo1.txt");
           int ch=0;
           while ((ch=fileReader.read())!=-1){
                fileWriter.write(ch);
           }
           fileWriter.close();
           fileReader.close();
   ```
   ``` 
   //通过字符流方式用数组复制
   FileWriter fileWriter = new FileWriter("demo2_copy.txt");
           FileReader fileReader = new FileReader("demo1.txt");
           int num=0;
           char [] buf = new char[1024];
           while ((num=fileReader.read(buf))!=-1){
                fileWriter.write(buf,0,num);
           }
   ```
   * FileWriter
 * 缓冲流
   * BufferInputStream
      ```
       BufferedInputStream bis = new BufferedInputStream(new FileInputStream("1.png"));
              BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("6_copy.png"));
             // byte[] bytes = new byte[1024];
              int num = 0;
              //理解为从缓冲区里面一个一个的拿
              while((num = bis.read())!=-1){
                   bos.write(num);
              }
              bis.close();
              bos.close();
      ```
   * BufferedOutputStream
   * BufferedReader
    ```
           fileReader = new FileReader("buf.txt");
           bufferedReader = new BufferedReader(fileReader);
           /*int num = 0;
             char [] ch = new char[1024];
               while((num=bufferedReader.read(ch))!=-1){
                 System.out.println(new String(ch,0,num));
                }*/
           //按照行的方式进行读取
             String line = null;
             while((line=bufferedReader.readLine())!=null){
             System.out.println(line);
           }                  
          
          ```
   * BufferedWriter
   ```
   fileWriter = new FileWriter("buf.txt",true);
   
    //为了提高字符读写效率，加入缓冲技术，只要将需要被提高效率的流对象作为参数传递给缓冲区的构造函数即可
     buf = new BufferedWriter(fileWriter);
     buf.write("cccc");
     buf.newLine();
     buf.write("ccdddddcc");
     //只要用到缓冲区，就要刷新
     buf.flush();
   ```
 * 转换流
   * InputStreamReader
   * OutputStreamWriter
   ```
   想改进变成一次读一行的模式   readLine   system.in  out 都是字节流 想办法包装成字符流进行操作
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
   ```
 * 标准输入/输出流
 * 打印流
   * PrintStream
   * PrintWriter
 * 数据流
   * DataInputStream
   * DataOutputstream
 * 对象流（序列化、反序列化）    
   * ObjectInputStream
   * ObjectOutputStream
 * 随机存取文件里流
   * RandomAccessFile
  
   