import java.io.File;

/**
 * java.io.File类
 * 1、凡是与输入、输出相关的类、接口等都定义在java.io下
 * 2、File是一个类，可以有构造器创建其对象
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) {

        /**
         * 绝对路径：包括盼复在内的完整的文件路径
         * 相对路径
         *File是一个类，可以有构造器创建器对象，此对象对应一个文件
         *File中的方法，仅涉及如何创建 删除 重命名等等,
         * 涉及到文件内容的file是无能为力的，必须由IO流完成
         *File类的对象常作为io流具体类的构造器的形参
         *
         */
        File file1 = new File("D:\\helloWorld.txt");
        File file2= new File ("hello.txt");
        File file3 = new File("D:\\IO");
        //获取文件名称
        System.out.println(file1.getName());
        //获取文件路径
        System.out.println(file1.getPath());
        //获取文件对象
        System.out.println(file1.getAbsoluteFile());
        //获取文件父级目录
        System.out.println(file1.getParent());
        //获取文件完整绝对路径
        System.out.println(file1.getAbsolutePath());

        //获取文件名称
        System.out.println(file3.getName());
        //获取文件路径
        System.out.println(file3.getPath());
        //获取文件对象
        System.out.println(file3.getAbsoluteFile());
        //获取文件父级目录
        System.out.println(file3.getParent());
        //获取文件绝对路径
        System.out.println(file3.getAbsolutePath());
        File file4 = new File("E:\\1.txt");
        System.out.println(file1.renameTo(file4));

    }
}
