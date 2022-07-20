package oop.exception_handling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            //int c = a/b;
            int[] arr = new int[4];
            arr[43] = 43;
        }catch (ArithmeticException e) {
            System.out.println("Exception: "+e);
        }
        catch (NullPointerException e) {
            System.out.println("Exception: "+e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: "+e);
        }
        catch (Exception e) {
            System.out.println("Exception: "+e);
        }
        finally {
            System.out.println("Last Line Of The Code.");
        }
    }
}
