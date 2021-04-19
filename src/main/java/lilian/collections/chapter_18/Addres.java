package main.java.lilian.collections.chapter_18;
import java.util.*;
//  Простой пример обработки списка почтовых адресов
public class Addres {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Addres(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    public String toString() {
        return name + "\n" + street + "\n" + city
                    + " | " + state + " | " + code;
    }
}
class MailList {
    public static void main(String[] args) {
        LinkedList<Addres> m1 = new LinkedList<Addres>();

        //  ввести элементы в связный список
        m1.add(new Addres("J.W. West" , "11 Oak Ave",
                            "Urbana", "IL", "61801"));
        m1.add(new Addres("Ralph Baker", "1142 Maple Lane",
                            "Mahomet","IL", "61853"));

        //  вывести список почтовых адресов
        for (Addres element : m1)
            System.out.println(element + "\n");

        System.out.println();
    }
}
