
/**
 * Write a description of class StartGame here.
 * 
 * @author Lauritz
 * @version 0.1.0
 */
public class StartGame
{
    /**
     * We want to load a few farmers and a player,
     * so we create four objects and give them some values.
     */
    
    private Farmer lars;
    
    public StartGame()
    {
        /**
         * Doesn't really need this right now.
         * We just want to load up some farmers and a player.
         */
    }
    
    public void startTheGame()
    {
        lars = new Farmer();
        lars.setName("Lars");
        lars.setAmountOfPotatoes(20);
        lars.setPrice(10);
    }
    
    public void testPrint(String hisName)
    {
        System.out.println("You can buy " + lars.getAmountOfPotatoes() + " of potatoes");
    }
}
