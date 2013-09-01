import java.util.Scanner;

public class Methods
{
    private Game theGame;
    
    public Methods()
    {
        /**
         * Just need to make a new game
         */

        theGame = new Game();
    }
    
    /**
     * byPotatoes prompts the user to buy some potatoes
     * @param hisName
     */
    public void buyPotatoes(String hisName)
    {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < theGame.listOfFarmers.length; i++)
        {
            if (hisName.equalsIgnoreCase(theGame.getFarmersName(i)))
            {
                System.out.println("You can buy " + theGame.getFarmersAmountOfPotatoes(i) + " potatoes from " + theGame.getFarmersName(i) + " for " + theGame.getFarmersPrice(i) + " each.");
                System.out.print("Would you like to buy some potatoes? (y/n)\n > ");
                String answer = scan.nextLine().trim();
                while (! answer.equalsIgnoreCase("y"))
                {
                    if (answer.equalsIgnoreCase("n"))
                    {
                        break;
                    }
                    System.out.print("Would you like to buy some potatoes? (y/n)\n > ");
                    answer = scan.nextLine().trim();
                }
                if (answer.equalsIgnoreCase("y"))
                {
                    while (true)
                    {
                        System.out.print("How many would you like to buy?\n > ");
                        try
                        {
                            int amount = Integer.parseInt(scan.nextLine().trim());
                            if (amount > theGame.getFarmersAmountOfPotatoes(i))
                            {
                                System.out.println("You can't buy that many potatoes.");
                            }
                            else if (amount <= 0)
                            {
                                System.out.println("You need to buy at least 1 potato.");
                            }
                            else
                            {
                            System.out.println("You succesfully bought " + amount + " potatoes from " + theGame.getFarmersName(i));
                            theGame.removePotatoesFromFarmer(i, amount);
                            break;
                            }
                        }
                        catch (final NumberFormatException e) {}

                        // if (amount > theGame.getFarmersAmountOfPotatoes(i))
                        // {
                        //     System.out.println("You can't buy that many potatoes.");
                        // }
                        // else if (amount <= 0)
                        // {
                        //     System.out.println("You need to buy at least 1 potato.");
                        // }
                        // else
                        // {
                        // System.out.println("You succesfully bought " + amount + " potatoes from " + theGame.getFarmersName(i));
                        // theGame.removePotatoesFromFarmer(i, amount);
                        // break;
                        // }
                    }
                }
            }
        }
    }
}
