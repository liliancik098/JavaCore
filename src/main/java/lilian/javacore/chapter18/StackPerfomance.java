package main.java.lilian.javacore.chapter18;
//  В этом классе определяется целочилсенный стек, который может
//  содержать 10 значений


 class StackPerfomance {
    /* Теперь переменные stck и tos являются закрытыми.
    Это означает, что они не могут быть случайно или
    намеренно изменены таким образом, чтобы нарушить стек.
    */
     private int stck[] = new int[10];
     private int tos;

     // инициализировать вершину стека
     StackPerfomance() {
         tos = -1;
     }

     // разместить элемент в стеке
     void push(int item) {
         if (tos==9)
             System.out.println("Стек заполнен.");
         else
             stck[++tos] = item;
     }

     // извлечь элемент из стека
     int pop() {
         if (tos < 0) {
             System.out.println("Стек не загружен.");
             return 0;
         }
         else
             return stck[tos--];
     }
}
class TestStack1 {
    public static void main(String[] args) {
        StackPerfomance mystack1 = new StackPerfomance();
        StackPerfomance mystack2 = new StackPerfomance();

        // разместиь числа в стеке
        for (int i=0; i<10; i++) mystack1.push(i);
        for (int i=10; i<20; i++) mystack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Стек в mystack1: ");
        for (int i=0; i<10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2: ");
        for (int i=0; i<10; i++)
            System.out.println(mystack2.pop());

        // эти операторы недостурны
        // mystack1.tos = -2;
        // mysatck2.stck[3] = 100;
    }
}
