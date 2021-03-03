package main.java.lilian.javacore.chapter18.game;

import java.util.Random;
import java.util.Scanner;

public class Field {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int iComScore;
    int iUserScore;
    int counter;


    Field() {
        iComScore = 0;
        iUserScore = 0;
        counter = 0;
    }

}

class GameLogic extends Field {

    void start() {
        System.out.println("Здраствуй, как тебя зовукт?");
        String name = scanner.nextLine();

        while (counter == 0) {
            int iComTurn = 1 + random.nextInt(3);

            System.out.println("Здравствуй " + name + "!" + " Выбери пожалуйста \n" +
                    "1 для Камень \n" +
                    "2 для Ножницы \n" +
                    "3 для Бумаги");
            int iUserTurn = scanner.nextInt();

            if (iUserTurn == iComTurn) {
                System.out.println("Ничья! \n" +
                        "Очки не будут вычисляться");
            }
            else if (iUserTurn == 1) {
                if (iComTurn == 2) {
                    System.out.println("Компютер выбрал: Ножницы.");
                    System.out.println(name + "," + " поздравляю, ты выйграл этот раунд!");
                    iUserScore++;
                    System.out.println("Счет по очкам: " + name + " " +
                            iUserScore + " | " + iComScore + " Computer");
                } else if (iComTurn == 3) {
                    System.out.println("Компютер выбрал: Бумагу.");
                    System.out.println(name + ", ты проиграл этот раунд!");
                    iComScore++;
                    System.out.println("Счет по очкам: " + name + " " +
                            iUserScore + " | " + iComScore + " Computer");
                }
            } else if (iUserTurn == 2) {
                if (iComTurn == 3) {
                    System.out.println("Компютер выбрал: Бумагу.");
                    System.out.println(name + "," + " поздравляю, ты выйграл этот раунд!");
                    iUserScore++;
                    System.out.println("Счет по очкам: " + name + " " +
                            iUserScore + " | " + iComScore + " Computer");
                } else if (iComTurn == 1) {
                    System.out.println("Компютер выбрал: Камень.");
                    System.out.println(name + ", ты проиграл этот раунд!");
                    iComScore++;
                    System.out.println("Счет по очкам: " + name + " " +
                            iUserScore + " | " + iComScore + " Computer");
                }

            } else if (iUserTurn == 3) {
                if (iComTurn == 1) {
                    System.out.println("Компютер выбрал: Камень.");
                    System.out.println(name + "," + " поздравляю, ты выйграл этот раунд!");
                    iUserScore++;
                    System.out.println("Счет по очкам: " + name + " " +
                            iUserScore + " | " + iComScore + " Computer");
                } else if (iComTurn == 2) {
                    System.out.println("Компютер выбрал: Ножницы.");
                    System.out.println(name + ", ты проиграл этот раунд!");
                    iComScore++;
                    System.out.println("Счет по очкам: " + name + " " +
                            iUserScore + " | " + iComScore + " Computer");
                }

            }
            if (iUserScore == 3 || iComScore == 3) {
                System.out.println();
                System.out.println("Игра окончена! \n" + name + " " +
                        iUserScore + " | " + iComScore + " Computer");
                counter++;
            }
        }
    }
}

    class RunGame {
        public static void main(String[] args) {
            GameLogic game = new GameLogic();
            game.start();
        }
    }

