
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
         * Don't really require any constructors right now.
         * We just want to test something.
         */
    }
    
    public void testPrint(String hisName)
    {
        theGame = new Game();
        if (hisName.equalsIgnoreCase(theGame.getFirstFarmersName()))
            System.out.println("You can buy " + theGame.getFirstFarmersAmountOfPotatotes() + " potatoes from " + theGame.getFirstFarmersName());
        else if (hisName.equalsIgnoreCase(theGame.getSecondFarmersName()))
            System.out.println("You can buy " + theGame.getSecondFarmersAmountOfPotatotes() + " potatoes from " + theGame.getSecondFarmersName());
        else if (hisName.equalsIgnoreCase(theGame.getThirdFarmersName()))
            System.out.println("You can buy " + theGame.getThirdFarmersAmountOfPotatotes() + " potatoes from " + theGame.getThirdFarmersName());
        else
            System.out.println("There is no farmers called that, try something else");
        
    }
}
