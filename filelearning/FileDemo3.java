package oop.filelearning;

import java.io.File;
import java.util.Scanner;

public class FileDemo3 {
    public static void main(String[] args) {
        try {
            File file = new File("D:/Java Practice/Anisul Islam Java/person/student.txt");
            Scanner in = new Scanner(file);
            while(in.hasNext()) {
                String id = in.next();
                String name = in.next();
                System.out.println("Id: "+id+" Name: "+name);
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
