
/**
 * Write a description of class StartGame here.
 * 
 * @author 
 * @version 0.0.1
 */
public class Game
{
    /**
     * We want to load a few farmers and a player,
     * so we create four objects and give them some values.
     */
    
    private Farmer firstFarmer;
    private Farmer secondFarmer;
    private Farmer thirdFarmer;
    
    public Game()
    {
        firstFarmer = new Farmer();
        firstFarmer.setName("Lars");
        firstFarmer.setAmountOfPotatoes(20);
        firstFarmer.setPrice(10);
    }
    
    public int getFirstFarmersAmountOfPotatotes()
    {
        return firstFarmer.getAmountOfPotatoes();
    }
    
    public String getFirstFarmersName()
    {
        return firstFarmer.getName();
    }
}
