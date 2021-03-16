package main.java.lilian.javacore.chapter1_8;
// Перфекционирование класса Steck, в котором использован члыен длина массива
public class StackVeryPerf {
    private int stck[];
    private int tos;

    //  выделить память код под стек и инициализировать его
    StackVeryPerf(int size) {
        stck = new int[size];
        tos = -1;
    }
    //  разместить элемент в стеке
    void push(int item) {
        if (tos==stck.length-1) // инициализировать член длины массива
            System.out.println("Стек заполнен!");
        else
            stck[++tos] = item;
    }
    //  извлечь элемент из стека
    int pop() {
        if (tos < 0){
            System.out.println("Стек не загружен!");
            return 0;
        }
        else
            return stck[tos--];
    }
}
class StackTest5 {
    public static void main(String[] args) {
        StackVeryPerf mystack1 = new StackVeryPerf(5);
        StackVeryPerf mystack2 = new StackVeryPerf(8);

        //  разместить числа в стеке
        for (int i = 0; i<5; i++) mystack1.push(i);
        for (int i = 0; i<8; i++) mystack2.push(i);

        //  извлечь эти числа из стека
        System.out.println("Стек mysteck1: ");
        for (int i =0; i<5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек mysteck2: ");
        for (int i =0; i<8; i++)
            System.out.println(mystack2.pop());
    }
}