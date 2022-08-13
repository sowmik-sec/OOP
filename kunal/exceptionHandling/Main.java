package oop.kunal.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            //int c = divide(a,b);
            String name = "Habib";
            if(name.equals("Habib")) {
                throw new MyException("Name is Habib");
            }
        }
        catch (MyException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException("Please do not divide by zero");
        return a/b;
    }
}
