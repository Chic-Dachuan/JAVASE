package cn.edu360.javase24.day09.FileManage;

import java.io.File;
import java.io.IOException;  // 抛出异常

public class FileDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 文件类
         * new File(path);
         */
        File file = new File("./b");  // 将路径描述为一个file对象
        file.mkdirs();  // 创建文件夹

        boolean directory = file.isDirectory(); // 判断路径是一个文件还是一个文件夹
        // System.out.println(directory);

        String filePath = file.getAbsolutePath();  //获取文件的绝对路径

        boolean fileor = file.isFile();  // 判断是否是一个文件
        // C:\Users\18845\JAVAcode\helloworld\src\cn\edu360\javase24\day09\FileManage\a.txt
        // C:\Users\18845\JAVAcode\helloworld\b

        File file1 = new File("C:\\Users\\18845\\JAVAcode" +
                "\\helloworld\\src\\cn\\edu360\\javase24\\day09\\FileManage\\a.txt");

        String name = file1.getName();  // 获取文件名
        // System.out.println(name1);   // 获取文件夹名
        // System.out.println(name);

        File Parentfile = file1.getParentFile();  //  返回前一级文件路径对象
        // System.out.println(Parentfile.getAbsolutePath());

        String parent = file1.getParent();  // 获取前一级文件路径

        long lenth = file1.length();  // 获取文件字节长度
        // System.out.println(lenth);

        String[] list = file1.list();  // 文件调list会返回null

        String[] arr = Parentfile.list();  // 文件路径调list方法返回当前目录下的所有文件
        for (String a: arr
             ) {
            // System.out.println(a);
        }

        File[] listFile = Parentfile.listFiles();  // 当前目录下所有文件以及文件夹都构建File对象，保存到一个数组中.

        for (File f: listFile
             ) {
            // System.out.println(f.getAbsolutePath());
        }

        // 创建一个文件
        // File file2 = new File("C:\\Users\\18845\\JAVAcode\\helloworld\\src\\cn\\edu360\\javase24\\day09\\FileManage\\xx");
        // boolean aa = file2.mkdir();
        // 多级路径创建不了   c:\\xx\\yy\\dd\\zz  这创建不了 C盘下没有xx
        // mkdirs() 可以创建多级目录
        // System.out.println(aa);

        File file3 = new File("C:\\Users\\18845\\JAVAcode\\helloworld" +
                "\\src\\cn\\edu360\\javase24\\day09\\FileManage\\c.txt");
//        boolean newFile = file3.createNewFile();
//        System.out.println(newFile);

        //boolean delete = file3.delete();
        //System.out.println(delete);

        // 文件重命名
        file3.renameTo(new File("C:\\Users\\18845\\JAVAcode\\helloworld" +
                "\\src\\cn\\edu360\\javase24\\day09\\FileManage\\a.txt"));
    }
}
