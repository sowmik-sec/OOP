package oop.filelearning;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File dir = new File("person");
        dir.mkdir(); // directory will be created
        String path = dir.getAbsolutePath();
        File file1 = new File(path+"/student.txt");
        File file2 = new File(path+"/teacher.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
        //file1.delete();
        if(file1.exists()) {
            System.out.println("file1 exists.");
        }
        else System.out.println("file1 doesn't exist");
    }
}
