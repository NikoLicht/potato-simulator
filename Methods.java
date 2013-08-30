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
    
    public void testPrint(String hisName)
    {
        Scanner scan = new Scanner(System.in);
        if (hisName.equalsIgnoreCase(theGame.getFirstFarmersName()))
        {
            System.out.println("You can buy " + theGame.getFirstFarmersAmountOfPotatoes() + " potatoes from " + theGame.getFirstFarmersName());
            System.out.printf("Would you like to buy some potatoes? (y/n): ");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("y")) {
                System.out.printf("How many would you like to by: ");
                int amount = scan.nextInt();
                System.out.println("You succesfully bought " + amount + " potatoes from " + theGame.getFirstFarmersName());
                theGame.setFirstFarmersAmountOfPotatoes(amount);
            }
        else if (hisName.equalsIgnoreCase(theGame.getSecondFarmersName()))
            System.out.println("You can buy " + theGame.getSecondFarmersAmountOfPotatotes() + " potatoes from " + theGame.getSecondFarmersName());
        else if (hisName.equalsIgnoreCase(theGame.getThirdFarmersName()))
            System.out.println("You can buy " + theGame.getThirdFarmersAmountOfPotatotes() + " potatoes from " + theGame.getThirdFarmersName());
        else
            System.out.println("There is no farmers called that, try something else");
        }
    }
}
