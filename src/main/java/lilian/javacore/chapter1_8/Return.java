package main.java.lilian.javacore.chapter1_8;
// Применение оператора return
public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("До возврата.");
        if (t) return; //   возврат в вызывающий код

        System.out.println("Этот оператор выполняться не будет.");
    }
}
