package main.java.lilian.javacore.chapter18;
/*
Программа, использующая класс Box

Присвоить исходному файлу имя BoxDemo.java
 */
public class Box {
    double width;
    double height;
    double depth;

    // Расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

}

class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        /*double vol;*/

        //Присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        //Присвоить значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // Получить обхем первого параллелепипеда
        /*vol = mybox1.volume();*/
        System.out.println("Объем равен " + mybox1.volume());

        // Получить обхем второго параллелепипеда
        /*vol = mybox2.volume();*/
        System.out.println("Объем равен " + mybox2.volume());
    }
}

/*

    // Вывести объем параллелепипеда
    void volume () {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}

// В этом классе объявляется объект типа Box
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
                    // Присвоить значение переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // Расчитать объем параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}
// В этой программе объявляеся два объекта класса Box
class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //* присвоить другие значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //* присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //Расчитать объем первого параллелепипеда
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);

        // Расчитать объем второго параллелепипеда
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем равен "+ vol);

    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        //Присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // Присвоить другие значения перменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // Вывести объем первого параллелепипеда
        mybox1.volume();
        // Вывести объем второго параллелепипеда
        mybox2.volume();
    }
}*/
