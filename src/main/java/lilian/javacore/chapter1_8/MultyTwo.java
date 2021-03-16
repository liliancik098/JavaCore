package main.java.lilian.javacore.chapter1_8;
// Применение сдвига влево в качестве юысьрого способа умножения на 2
public class MultyTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for (i = 0; i<4 ; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}
