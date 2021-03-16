package main.java.lilian.javacore.chapter1_8;
/*
 В данном примере конструкторы определяются в классе Box для
 инициализации размеров параллелепипеда тремя разными способами
 */
public class Box1 {
    double width;
    double height;
    double depth;

    //  конструктор, исапользоваемый при указании всех размеров
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //  конструктор, использоваемый, когда ни один из размеров не указан
    Box1() {
        width = -1;     //использовать значение -1 для обозначения
        height = -1;    //неинициализированного
        depth = -1;     //параллелепипеда
    }

    // конструктор, использоваемый при создании куба
    Box1(double len) {
        width = height = depth = len;
    }

    //  расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String[] args) {
        //  создать параллелепипеды, используя разные консьрукторы
        Box1 mybox1 = new Box1(10,20,15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);

        double vol;

        //  получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        //  получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        //  получить объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}
