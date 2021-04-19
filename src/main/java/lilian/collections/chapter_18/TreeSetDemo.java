package main.java.lilian.collections.chapter_18;
//  Демонстрация применения класса TreeSet

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        //  создать дровидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<String>();

        //  ввести элементы в дровидное множество типа TreeSet
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);

    }
}
