package main.java.lilian.javacore.chapter18;
/**
 * Вычисление площади круга
 */
public class Area {
    public static void main(String[] args) {
        double pi, r, a;
        r = 10.8;       // радиус окружности
        pi = 3.1416;    // приблизительное значение чилса пи
        a = pi * r * r; // вычислить площадь круга

        System.out.println("Площадь круга равна " + a);
    }
}
