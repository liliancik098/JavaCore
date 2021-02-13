package main.java.lilian.javacore.chapter18;
// Использование оператора break в качестве цивилизованной формы оператора goto
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Предшествует оператору break.");
                    if (t) break second; // выход из блока second
                    System.out.println("Этот оператор не выполняется");
                }
                System.out.println("Этот оператор не выполняется");
            }
            System.out.println("Этот оператор следует за блоком second.");
        }
    }
}
