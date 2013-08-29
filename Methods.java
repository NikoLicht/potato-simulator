
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
            System.out.println("You can buy " + theGame.getFirstFarmersName() + " of potatoes from Lars");
        else
            System.out.println("There is no farmers called that, try something else");
        
    }
}
