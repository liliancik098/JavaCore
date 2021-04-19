package main.java.lilian.collections.chapter_18;
import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        //  создать древовидное отоброжение
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        //  ввести элементы в древовидное отоброжение
        tm.put("Джон Сноу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн бейкер", new Double(1378.00));
        tm.put("Тод Халл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        //  получить множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //  вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //  внести сумму 1000 на счет Джона Сноу
        double balance = tm.get("Джон Сноу");
        tm.put("Джон Сноу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Сноу: "
        + tm.get("Джон Сноу"));
    }
}
