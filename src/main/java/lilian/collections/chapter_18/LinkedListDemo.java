package main.java.lilian.collections.chapter_18;
//  Демонстрация применения класса LinkedLink
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        //  создать связанный список
        LinkedList<String> ll = new LinkedList<String>();

        //  ввести элементы в связаный список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1,"A2");
        System.out.println("Исходное содержимое связынного списка ll: " + ll);

        //  удалить элементы из списка
        ll.remove("F");
        ll.remove(2);
        System.out.println(
                "Содержимое связного списка ll " +
                        "после удаления элементов: " + ll);

        //  удалить первый и последний элемент связного массива
        ll.removeFirst();
        ll.removeLast();
        System.out.println(
                "Содержимое связного списка ll " +
                        "после удаления элементов: " + ll);
        //  получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + " изменено");

        System.out.println("Содержимое списка после изменения: " + ll);

    }
}
