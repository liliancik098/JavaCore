package main.java.lilian.javacore.games;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    Field field = new Field();
    private final String pc = "Computer";
    private String userName;
    private int iComScore = 0;
    private int iUserScore = 0;
    private int counter = 0;

    Scanner sc = new Scanner(System.in);
    Random ra = new Random();

    GameLogic(String userName) {
        this.userName = userName;
    }
     GameLogic() {
         userName = "Игрок";
    }


    void startGame() {
        while (counter == 0) {
            field.setiComTurn(1 + ra.nextInt(3));

            System.out.println("Здравствуй " + userName + "!" + " Выбери пожалуйста \n" +
                    "1 для Камень \n" +
                    "2 для Ножницы \n" +
                    "3 для Бумаги");
            field.setiUserTurn(sc.nextInt());
            equalsGame();
            winGame();
            loseGame();
            finish();
        }
    }

    void equalsGame() {
        if (field.getiComTurn() == field.getiUserTurn()) {
            System.out.println("Ничья! \n" +
                    "Очки не будут вычисляться");
        }
    }

    void winGame() {
        if (field.getiUserTurn() == 1 && field.getiComTurn() == 2) {
            System.out.println("Компютер выбрал: Ножницы.");
            System.out.println(userName + "," + " поздравляю, ты выйграл этот раунд!");
            iUserScore++;
            System.out.println("Счет по очкам: " + userName + " " +
                    iUserScore + " | " + iComScore + " " + pc);
        } else if (field.getiUserTurn() == 2 && field.getiComTurn() == 3) {
            System.out.println("Компютер выбрал: Бумагу.");
            System.out.println(userName + "," + " поздравляю, ты выйграл этот раунд!");
            iUserScore++;
            System.out.println("Счет по очкам: " + userName + " " +
                    iUserScore + " | " + iComScore + " " + pc);
        } else if (field.getiUserTurn() == 3 && field.getiComTurn() == 1) {
            System.out.println("Компютер выбрал: Камень.");
            System.out.println(userName + "," + " поздравляю, ты выйграл этот раунд!");
            iUserScore++;
            System.out.println("Счет по очкам: " + userName + " " +
                    iUserScore + " | " + iComScore + " " + pc);
        }
    }

    void loseGame() {
        if (field.getiUserTurn() == 1 && field.getiComTurn() == 3) {
            System.out.println("Компютер выбрал: Бумагу.");
            System.out.println(userName + "," + " ты проиграл этот раунд!");
            iComScore++;
            System.out.println("Счет по очкам: " + userName + " " +
                    iUserScore + " | " + iComScore + " " + pc);
        } else if (field.getiUserTurn() == 2 && field.getiComTurn() == 1) {
            System.out.println("Компютер выбрал: Камень.");
            System.out.println(userName + "," + " ты проиграл этот раунд!");
            iComScore++;
            System.out.println("Счет по очкам: " + userName + " " +
                    iUserScore + " | " + iComScore + " " + pc);
        } else if (field.getiUserTurn() == 3 && field.getiComTurn() == 2) {
            System.out.println("Компютер выбрал: Ножницы.");
            System.out.println(userName + "," + " ты проиграл этот раунд!");
            iComScore++;
            System.out.println("Счет по очкам: " + userName + " " +
                    iUserScore + " | " + iComScore + " " + pc);
        }
    }
    void finish() {
        if (iUserScore == 3 || iComScore == 3) {
            System.out.println();
            System.out.println("Игра окончена! \n" + userName + " " +
                    iUserScore + " | " + iComScore + " " + pc);
            counter++;
        }
    }
}
