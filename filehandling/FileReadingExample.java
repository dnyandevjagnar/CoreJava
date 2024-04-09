package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {


    public static void main(String[] args) throws IOException {

        File file1= new File("F:\\EDSO\\Edso\\Automation testing\\JAVA\\createdfile1.txt");

        System.out.println( file1.isFile());
        FileReader fileReader=new FileReader(file1);

        int a;
        while((a=fileReader.read())!=-1){
            System.out.print((char)a);
        }
        fileReader.close();
    }
}
