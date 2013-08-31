import java.util.Scanner;

/**
 * Write a description of class Methods here.
 * 
 * @author 
 * @version 0.0.1
 */
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
                        System.out.println("You can buy " + theGame.getFarmersAmountOfPotatoes(i) + " potatoes from " + theGame.getFarmersName(i));
                        System.out.printf("Would you like to buy some potatoes? (y/n): ");
                        String answer = scan.next();
                        if (answer.equalsIgnoreCase("y")) {
                            System.out.printf("How many would you like to by: ");
                            int amount = scan.nextInt();
                            System.out.println("You succesfully bought " + amount + " potatoes from " + theGame.getFarmersName(i));
                            theGame.removePotatoesFromFarmer(i, amount);
                            }
            }
        }
    }
}
