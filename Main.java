/**
 * Write a description of class Methods here.
 * 
 * @author 
 * @version 0.0.3
 */

import java.util.Scanner;

public class Main
{
    private String   playerName;
    private Methods  methods;
    private Game     game;

    public Main()
    {
        /**
         * Don't need a constructor at this moment
         */
    }
    
    public static void main(String[] args) {
        Methods  methods = new Methods();
        Game     game    = new Game();
        Scanner  scan    = new Scanner(System.in);

        System.out.println("Welcome to Potato Simulator!");
        System.out.println("This is a little, interactive game about potatoes.");
        System.out.print("Please type your player name\n > ");
        String playerName = scan.nextLine().trim();
        System.out.println("Welcome to the game, " + playerName);

        System.out.println("Try to buy some potatoes (buy potatoes) ");

        String message;

        while (true)
        {
            System.out.print(" > ");
            message = scan.nextLine().trim();
            if (message.equalsIgnoreCase("done"))
            {
                break;
            }
            if (message.equalsIgnoreCase("buy potatoes"))
            {
                System.out.println("You can buy potatoes from");
                for (int i = 0; i < game.listOfFarmers.length; i++)
                {
                    System.out.println("* " + game.getFarmersName(i));
                }
                System.out.print("Who do you want to buy from\n > ");
                message = scan.nextLine();
                methods.buyPotatoes(message);
            }
        }
    }
}