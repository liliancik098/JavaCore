package main.java.lilian.javacore.chapter18;

import java.util.NoSuchElementException;

//  Демонстрация перегрузки методов
public class OverLoadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    //  Перегружаемый метод, проверяющий наличие
    //  наличие целочисленного параметра
    void test(int a) {
        System.out.println("a: " + a);
    }
    //  Перегружаемый иетод, проверяющий наличие
    //  двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }
    //  Перегружаемыйй метод, проверяющий наличие
    //   параметра типа double
    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}
class Overload {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        double result;

        //  вызвать все варианты метода test()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Результат вызова ob.test(123.25): " + result);
    }
}