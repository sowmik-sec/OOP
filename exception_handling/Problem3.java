package oop.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        while(true) {
            System.out.print("Do you want to divide two numbers? (y/n): ");
            String s = in.next();
            if(s.equals("n")) break;
            double n=0, m=0;
            try {
                System.out.print("Please enter num1: ");
                n = in.nextDouble();
                System.out.print("Please enter num2: ");
                m = in.nextDouble();
                System.out.println("Result: "+n+"/"+m+" = "+(n/m));
            } catch (InputMismatchException e) {
                System.out.println("Exception: "+e);
                System.out.println("You must enter integer, Please try again");
            } catch (ArithmeticException e) {
                System.out.println("Exception: "+e);
                System.out.println("You must enter integer, Please try again");
            } catch (Exception e) {
                System.out.println("Exception: "+e);
                System.out.println("You must enter integer, Please try again");
            }
        }
    }
}
