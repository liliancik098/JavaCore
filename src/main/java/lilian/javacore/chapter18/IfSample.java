package main.java.lilian.javacore.chapter18;
/*
Предомонстрировать применение условного оператора if.
Присвоить исходному файлу имя "IfSample"
 */
public class IfSample {
    public static void main(String[] args) {
        int x,y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше у");

        x *= 2;
        if (x == y) System.out.println("x теперь равно у");

        x *= 2;
        if (x > y) System.out.println("х теперь больше у");

        // этот оператор ничео не будет выводить
        if (x == y) System.out.println("Вы ничего не видите");
    }
}
