package oop.filelearning;

import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            Formatter formatter = new Formatter("D:/Java Practice/Anisul Islam Java/person/student.txt");
            System.out.print("How many student(s): ");
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter id and name: ");
                int id = in.nextInt();
                String name = in.next();
                formatter.format("%s %s\r\n",id,name);
            }
            formatter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
