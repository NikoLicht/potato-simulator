
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
        if (hisName == theGame.getFirstFarmersNameOfPotatoes())
            System.out.println("You can buy " + theGame.getFirstFarmersAmountOfPotatotes() + " of potatoes from Lars");
        
    }
}
