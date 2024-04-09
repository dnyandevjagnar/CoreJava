package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        File file=new File("F:\\EDSO\\Edso\\Automation testing\\JAVA\\createdfile1.txt");
        file.createNewFile();//create new file
        System.out.println("check the file are present or not : "+file.isFile());
        System.out.println("find the length of file : "+file.length());
        System.out.println("can this file are readable : "+file.canRead());
        System.out.println("can this file are write : "+file.canWrite());
        System.out.println("can this file tested : "+file.isAbsolute());
        System.out.println("this is file directory of file : "+file.isDirectory());
        System.out.println("file of name : "+file.getName());
        System.out.println("parent file of path : "+file.getParent());
        System.out.println("file of path : "+file.toPath());
        System.out.println("file url : "+file.toURI());


    }
}
