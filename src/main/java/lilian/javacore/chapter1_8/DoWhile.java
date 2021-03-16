package main.java.lilian.javacore.chapter1_8;
// Демонстрация применения оператора цикла do-while
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("такт " + n);
            n--;
        } while (n > 0);

    }
}
