package main.java.lilian.collections.chapter_18;
//  Использовать компаратор для сортировки счетов
//  по фамилиям вкладчиков
import java.util.*;

//  сравнить последние слова в обеих символьных строках
public class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        //  найти индекс символа, с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k==0)   //  фамилии совподают, проверить имя
                    //  и фамилию полностью
            return aStr.compareTo(bStr);
        else
            return k;
    }
    //  переопределить метод equals() не требуется
}

class TreeMapDemo2 {
    public static void main(String[] args) {
        //  создать древовидное отоброжение
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

        //  ввести элементы в древовидное отоброжение
        tm.put("Джон Сноу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Холл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        //  получить множетсво элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //  вывести элементы из множество
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        //  внести сумму 1000 на счет Джона Сноу
        double balance = tm.get("Джон Сноу");
        tm.put("Джон Сноу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Сноу: " + tm.get("Джон Сноу"));
    }
}
