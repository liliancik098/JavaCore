package main.java.lilian.collections.chapter_18;
//  использовать метод thenComparing() для сортировки
//  счетов вкладчиков сначала по фамилии, а затем по имени
import java.util.*;

//  компаратор,сравнивающий фамилии вкладчиков

class ComplastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        //  найти индекс символа, с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
//  отсортировать счета вкладчиков по Ф.И.О,
//  если фамилии одинаковы
class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i , j;

        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo2A {
    public static void main(String[] args) {
        //  использовать метод thenComparing() для создания
        //  компаратора, сравнивающего сначала фамилии, а потом
        //  Ф.И.О. вкладчиков, если фамилии одинаковы
        ComplastNames complN = new ComplastNames();
        Comparator<String> compLastThenFirst = complN.thenComparing(new CompThenByFirstName());

        //  создать древовидное отоброжение
        TreeMap<String, Double> tm = new TreeMap<String, Double>(compLastThenFirst);
        //  вывести элементы в древовидное отоброжение
        tm.put("Джон Сноу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Холл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        //  получить множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //  вывести элементы из множества
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
