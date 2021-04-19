package main.java.lilian.collections.chapter_18;
// Демонстрация применения класса ArrayList

import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<String>();

        System.out.println("Начальный размер списочного массива al: " + all.size());

        //  ввести элементы в списочный массив
        all.add("C");
        all.add("A");
        all.add("E");
        all.add("B");
        all.add("D");
        all.add("F");
        all.add(1, "A2");
        System.out.println("Размер списочного массива all после ввода элементов: " + all.size());

        //  вывести списочный массив
        System.out.println("Содержимое списочного массива all: " + all);

        //  удалить элементы из списочного массива all
        all.remove("F");
        all.remove(2);

        System.out.println("Размер списочного массива all после удаление элементов: " + all.size());
        System.out.println("Содержимое списочного массива all: " + all);

    }
}
