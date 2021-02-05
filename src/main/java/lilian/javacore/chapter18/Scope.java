package main.java.lilian.javacore.chapter18;

/**
 * Продемонстрировать область дейсвтия блока кода
 */
public class Scope {
    public static void main(String[] args) {
        int x; // это переменная доступна всему коду из метода main()

        x = 10;
        if (x == 10) {      // начало новой области действия,
            int y = 20;     // доступной только этому блоку кода

            // обе переменные х и у доступны в этой области дейсвтия
            System.out.println("х и у: " + x + " " + y);
            y *= 2;
        }
        // y = 100;         // ОШИБКА! переменная у недоступна
                            //в этой области действия, тогда как
                            // переменная х доступна и здесь
        System.out.println("х равно " + x);
    }
}
