package oop.overloading;

public class VariableLengthArguments {
    void add(int ... num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        VariableLengthArguments ob1 = new VariableLengthArguments();
        ob1.add(10);
        ob1.add(10,20,30,40,50,50);
        ob1.add(3,2,11,3,4,2,4);
    }
}
