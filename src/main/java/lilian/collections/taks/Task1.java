package main.java.lilian.collections.taks;

import java.util.*;

/**
 * Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива, значения которых в сумме дают число переданное в массив.
 * Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
 * Один и тот же элемент не может быть использован дважды.
 * array = [3, 8, 15, 17], Number = 23
 * result = [1,2]
 *
 * Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23
 */
public class Task1 {
//    boolean rsl = false;
//    int num1, num2;

//    public void search(int[] array, int sum) {
//      for (int i = 0; i < array.length - 1; i++) {
//          for (int j = array.length-1; j > 0; j--) {
//              num1 = array[i];
//              num2 = array[j];
//              if (num1 + num2 == sum) {
//                  System.out.println("Значение " + num1 +  " и " + num2 + " в сумме дают искомое число " + sum);
//                  rsl = true;
//              }
//
//          }
//          if (rsl)
//              break;
//      }
// }

    public void search(int[] array, int sum) {
        Map<Integer, Integer> st = new HashMap<>();
        int potential;

        for (int i = 0; i < array.length; i++) {
            potential = sum - array[i];
            st.put(i, array[i]);

            if (st.containsValue(potential)) {
                System.out.println("Элементы найдены: " + potential + " и " + array[i]);
                break;
            }
        }

    }









    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.search(new int[]{32, 45, 21, 54, 34, 5, 2, 7}, 59);

    }


}
