package main.java.lilian.javacore.chapter18;
// В этой программе демонстрируется отличие модификаторов public и private
class TestPublicPrivate {
    int a;              // доступ по умолчанию
    public int b;       // открытый доступ
    private int c;      // закрытый доступ

    // методы доступа к члену c данного класса
    void setc (int i) {     // установить значение члена с данного класса
        c = i;
    }
    int getc() {            // получить значение члена с данного класса
        return c;
    }
}
class AccesTest {
    public static void main(String[] args) {
        TestPublicPrivate ob = new TestPublicPrivate();

        // Эти операторы правильны, поэтому члены а и b
        // данного класаа доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        //  Этот оператор неверен и может вызвать ошибку
        //  ob.c = 100;     // ОШИБКА!

        // Доступ к члену с данного класса должен осуществляться
        // с помощью методов ее класса
        ob.setc(100);   //ВЕРНО!
        System.out.println("a,b и с: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}