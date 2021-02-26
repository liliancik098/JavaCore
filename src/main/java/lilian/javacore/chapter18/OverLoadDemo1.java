package main.java.lilian.javacore.chapter18;
//  Применение автоматического преоброзования типов к перегрузке
public class OverLoadDemo1 {
    void test() {
        System.out.println("Параметры отсутствуеют");
    }

    // Перегружаемый метод, проверяющий наличие
    // двухчисленных параметров
    void test(int a, int b) {
        System.out.println("а и b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    // параметра типа double
    void test(double a) {
        System.out.println(
                "Внутренее преоброзование при вызове test(double) a: " + a);
    }
}
class Overload1 {
        public static void main(String[] args) {
            OverLoadDemo ob = new OverLoadDemo();
            int i = 88;

            ob.test();
            ob.test(10,20);

            ob.test(i);         // здесь вызывается вариант метода test(double)
            ob.test(123.2); // а здесь вызывается вариант метода test(double)
        }
}

