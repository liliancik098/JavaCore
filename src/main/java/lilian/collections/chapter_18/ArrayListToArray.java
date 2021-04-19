package main.java.lilian.collections.chapter_18;
/*
Преоброзование списочного массива ArrayList в обычный массив
 */
import java.util.*;
public class ArrayListToArray {
    public static void main(String[] args) {
        //  создать списочный массив
        ArrayList<Integer> all = new ArrayList<Integer>();

        //  ввести элементы в списочный массив
        all.add(1);
        all.add(2);
        all.add(3);
        all.add(4);

        System.out.println("Содержимое списочного массива: " + all);

        //  Получить обычный массив
        Integer ia[] = new Integer[all.size()];
        ia = all.toArray(ia);

        int sum = 0;

        //  суммировать элементы массива
        for (int i : ia) sum += i;

        System.out.println("Сумма: " + sum);
    }
}
