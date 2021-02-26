package main.java.lilian.javacore.chapter18;
//  Аргументыпримитивных типов передаются по значению
public class Test1 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();

        int a = 15, b = 20;

        System.out.println("а и b до вызова: " + a + " " + b);
        ob.meth(a, b);

        System.out.println("а и b после вызова: " + a + " " + b);
    }
}