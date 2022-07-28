package oop.kunal.static_keyword;

public class InnerClass {
    static class Test {
        static String name;
        Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClass ob = new InnerClass();
        Test test = new Test("Ahsan Habib");
        Test test2 = new Test("Sowmik");
        System.out.println(test.name);
        System.out.println(test2.name);
    }
}
