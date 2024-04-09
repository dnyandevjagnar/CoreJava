package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingExample {
    public static void main(String[] args) throws IOException {
        File file1= new File("F:\\EDSO\\Edso\\Automation testing\\JAVA\\createdfile1.txt");
        FileWriter fileWriter=new FileWriter(file1);
        fileWriter.write("edso ");
        fileWriter.write("services ");
        fileWriter.write("pune");

        fileWriter.close();
    }
}
