package main.java.lilian.collections.taks;

import java.util.*;

public class Task1 {

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
