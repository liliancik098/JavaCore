package main.java.lilian.javacore.chapter1_8;
public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,4,7,8.37);
        BoxNasled plainbox = new BoxNasled();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        // присвоить ссылке на объект BoxWeight ссылки на объект BoxNasled
        plainbox = weightbox;
        vol = plainbox.volume();    // верно, так как метод volume()
                                    // определен в классе BoxNasled
        System.out.println("Объем plainvox равен " + vol);
        /*Следующий оператор ошибочен, поскольку член plainbox
        * не определяет член weight.*/
        // System.out.println("Вес plain равен " + plainbox.weight);
    }
}
