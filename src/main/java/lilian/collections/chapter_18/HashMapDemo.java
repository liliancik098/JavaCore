package main.java.lilian.collections.chapter_18;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        //  создать хеш-отоброжение
        HashMap<String, Double> hm = new HashMap<String, Double>();

        //  вывести элементы в хеш-отоброжение
        hm.put("Джон Сноу", new Double(3434.34));
        hm.put("Том Смит", new Double(123.22));
        hm.put("Джейн Бейкер", new Double(1378.00));
        hm.put("Тод Холл", new Double(99.22));
        hm.put("Ральф Смит", new Double(-19.08));

        //  получить множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        //  вывести множество записей
        for (Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //  вывести сумму 1000 на счет Джона Сноу
        double balance = hm.get("Джон Сноу");
        hm.put("Джон Сноу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Сноу: "
                            + hm.get("Джон Сноу"));
    }
}
