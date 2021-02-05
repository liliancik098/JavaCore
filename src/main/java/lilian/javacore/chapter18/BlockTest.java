package main.java.lilian.javacore.chapter18;
/*
Предомонстрировать применение блока кода.
Писвоить исходному файлу имя "BlockTest".
 */
public class BlockTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        //адресатом этого оператора цикла служит блок кода
        for (x = 0; x <10; x++) {
            System.out.println("Значение х: " + x);
            System.out.println("Значение у: " + y);
            y -= 2;
        }
    }
}
