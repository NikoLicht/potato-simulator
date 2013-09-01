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
		System.out.print("Please type your player name: ");
		String playerName = scan.next();
		System.out.println("Welcome to the game, " + playerName);

		System.out.print("Try to buy some potatoes (buy potatoes): ");

        String message;

        do {
            message = scan.nextLine();
            if (message.equalsIgnoreCase("done"))
            {
                break;
            }
            if (message.equalsIgnoreCase("buy potatoes"))
            {
                System.out.println("Who do you want to buy potatoes from? You can buy from");
                for (int i = 0; i < game.listOfFarmers.length; i++)
                {
                    System.out.println("  " + game.getFarmersName(i));
                }
                System.out.print("Who do you want to buy from: ");
                message = scan.nextLine();
                methods.buyPotatoes(message);
            }
        }
        while (true);
    }
}