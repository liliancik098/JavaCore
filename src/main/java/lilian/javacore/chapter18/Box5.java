package main.java.lilian.javacore.chapter18;

import java.util.StringJoiner;

// Расширение класса BoxWeight включением в него
// поля стоимости доставки
public class Box5 {
    private double width, height, depth;

    // сконтруировать клон оъекта
    Box5(Box5 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // консструткор, применяемый при указании всех размеров
    Box5(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // констрктор, применяемый в отсутствие размеров
    Box5() {
        width = -1;
        height = -1;
         depth = -1;
    }

    //конструктор применяемый при создании куба
    Box5(double len) {
        width = height = depth = len;
    }
    // расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
// добавитб поле веса
class BoxWeight1 extends Box5 {
    double weight; // вес паралеллепипеда

    // сконструировать клое объекта
    BoxWeight1(BoxWeight1 ob) {
        super(ob);
        weight = ob.weight;
    }

    //конструткор применяемый при указании всех параметров
    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // конструктор по умолчанию
    BoxWeight1() {
        super();
        weight = -1;
    }

    //  конструктор, применяемый при создании куба
    BoxWeight1(double len, double m) {
        super(len);
        weight = m;
    }
}
//добавить полсе стоимости доставки
class Shipment extends BoxWeight1 {
    double cost;

    // сконструировать клон объекта
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    // сконструировать,используемый при указании всех параметров
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    // конструктор, применяемый по умолчанию
    Shipment() {
        super();
        cost = -1;
    }

    // конструктор применяемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("Объем shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоймоти доставки: $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Объем shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоймоти доставки: $" + shipment2.cost);

    }
}
