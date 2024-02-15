package lesson003.ts003;

import lesson003.ts003.game.*;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        AbstractGame nGame = new NumberGame();
        Scanner scanner = new Scanner(System.in);

        nGame.start(4, 10);
        while(nGame.getGameStatus().equals(GameStatus.START)){
            System.out.print("Ваш ответ: ");
            String value = scanner.nextLine();

            Answer answer = nGame.inputValue(value);
            System.out.println(answer);
        }

        System.out.println(nGame.getGameStatus().getDescription());
    }
}
