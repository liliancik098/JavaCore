package main.java.lilian.javacore.chapter1_8;
//  Простой примео рекурсии
public class Factorial {
    int fact (int n) {
        int result;
        System.out.println("Сейчас: " + n);

        if (n==1) return 1;
            result = fact(n - 1) * n;
            return result;

    }
}
class  Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Факториял 3 равен " + f.fact(3));
        System.out.println("Факториял 4 равен " + f.fact(4));
        System.out.println("Факториял 5 равен " + f.fact(5));
    }
}
