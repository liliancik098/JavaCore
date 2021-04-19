package main.java.lilian.collections.chapter_18;
//  Демонстрация применения класса HashSet

import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        //  создать хеш множество
        HashSet<String> hs = new HashSet<String>();

        //  ввести все элементы в хеш-множество
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);
    }
}
