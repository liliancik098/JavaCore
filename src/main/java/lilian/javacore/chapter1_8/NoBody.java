package main.java.lilian.javacore.chapter1_8;
// Целевая часть цикла может быть пустой
public class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;

        // расчитать среднее значение переменных i и j
        while (++i < --j); // у этого цикла нет  тело
        System.out.println("Среднее значение равно " + i);
    }
}
