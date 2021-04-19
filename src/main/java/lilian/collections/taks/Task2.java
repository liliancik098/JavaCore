package main.java.lilian.collections.taks;

public class Task2 {
    boolean rsl = false;
    int num1, num2;

    public void search(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                /*num1 = array[i];
                num2 = array[j];*/
                if (array[i] == array[j] ) {
                    System.out.println("Значение " + array[i] + " повторяется");
                    rsl = true;
                }
            }
            if (rsl)
                break;

        }
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.search(new int[]{4, 5, 3, 2, 7, 12, 25, 34, 76, 234, 12});

    }
}
