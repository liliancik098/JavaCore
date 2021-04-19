package main.java.lilian.collections.chapter_18;
//  Демонстрация простого применения интерфейса Spliterator
import java.sql.SQLOutput;
import java.util.*;
public class SpliteratorDemo {

    public static void main(String[] args) {
        //  создать списочный массив числовых значений
        //  типа double

        ArrayList<Double> vals = new ArrayList<>();

        //  ввести значения в списочный массив
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        //  вызвать метод tryAdvance() для вывода содержимого
        //  списочного массва vals
        System.out.print("Содержимое списочного массива vals:\n");
        Spliterator<Double> splitr = vals.spliterator();
        while (splitr.tryAdvance((n) ->
                System.out.println(n)));
        System.out.println();

        //  создать новый списочный массив,
        //  содержащий квадратные корни числовых значений из списочного массива vals
        splitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splitr.tryAdvance((n)->
                sqrs.add(Math.sqrt(n))));

        //  вызвать метод foreacjRemaining() для вывода
        //  содержимого списочного массива sqrs
        System.out.print("Содержимое списочного массива sqrs:\n");
        splitr = sqrs.spliterator();
        splitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();

    }
}
