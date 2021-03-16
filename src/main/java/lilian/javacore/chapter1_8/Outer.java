package main.java.lilian.javacore.chapter1_8;
//  Демонстрация применения внутреннего класса
class Outer {
    int outer_x = 100;

    void test() {
        for (int i=0; i<10; i++) {
            class Inner {
                void display() {
                    System.out.println("вывод: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}



/*class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    //  это внутрений класс
    class Inner{
        int y = 10; // у - локальная переменная класса Inner

        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }
    *//*void showy() {              <-|
        System.out.println(y); //   | --->  ошибка, здесь переменная "у" недоступна
    }*//*                       //  <-|
}
class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}*/
/*public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    //  это внутрений класс
    class Inner {
        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }
}
class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}*/
