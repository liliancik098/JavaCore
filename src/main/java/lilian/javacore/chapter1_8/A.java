package main.java.lilian.javacore.chapter1_8;
// Переопределение метода
class A {
    int i, j;
    A(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
class B extends A {
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // вывести содержимое переменной к с помощью метода,
    // переопределяющего метод show() из класса А
    void show(String msg) {

        System.out.println(msg+ k);
    }
}
class Override {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show("Это из класса В: ");   // здесь вызывается метод show() из класса В
        subOb.show();   // вызывать метод show() из класса А
    }
}


/* В иерархии классов закрытые члены остаются закрытыми
в пределах своего класса.
Эта прграмма содержит ошибку, и поэтому суомпилировать её не удастся.
*/
/*//*
/   использовать ключевое слово super с целью предотвратить сокрытие имен*//*


// Демонстрация порядок вызова конструкторов
// создать суперкласс
class A {
    A() {
        System.out.println("В конструкторе А.");
    }
}
// создать подкласс путем расширения класса А
class  B extends A {
    B() {
        System.out.println("В конструкторе В.");
    }
}
// создать еще один подкласс путем расширения класса В
class C extends B {
    C(){
        System.out.println("В конструкторе С.");
    }
}
class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
*/
/*
class A {
    int i;
}
// создать подкласс путем расширения класса А
class  B extends A {
    int i;  // этот член i скрывает член i из класса А

    B (int a, int b) {
        super.i = a; // член i из класса А
        i = b;       // член i из класса B
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1,2);

        subOb.show();
    }
}
*/
/*
class A {
    int i;          // этот член открыт по умолчанию
    private int j;  // а этот член закрыт в классе А

    void setij(int x, int y) {
        i=x;
        j=y;
    }
}

//  Член j класса А в этом классе недоступен
class B extends A{
    int total;
    void sum() {
   //     total = i + j; //Ошибка: член j в этом классе недоступен
    }
}

class Acces {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
*/
/*public class A {
    int i, j;

    void showij() {
        System.out.println("i и j: " + i + " " + j);
    }
}

//  создать подкласс путем расширения класса А
class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i+j+k: " + (i+j+k));
    }
}
class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        //  суперкласс может использовать самостоятельно
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showij();
        System.out.println();

        *//*Подкласс имеет доступ ко всем открытым членам своего суперкласса.*//*
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j и k в объекте subOb: ");
        subOb.sum();
    }
}*/
