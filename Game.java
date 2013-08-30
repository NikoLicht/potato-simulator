
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
        firstFarmer.setName("Torben");
        firstFarmer.setAmountOfPotatoes(60);
        firstFarmer.setPrice(10);
        
        secondFarmer = new Farmer();
        secondFarmer.setName("Henning");
        secondFarmer.setAmountOfPotatoes(80);
        secondFarmer.setPrice(15);
        
        thirdFarmer = new Farmer();
        thirdFarmer.setName("Tobias");
        thirdFarmer.setAmountOfPotatoes(30);
        thirdFarmer.setPrice(20);
    }
    
    public void setFirstFarmersAmountOfPotatoes(int amountOfPotatoesToChange)
    {
        firstFarmer.setAmountOfPotatoes(getFirstFarmersAmountOfPotatoes() - amountOfPotatoesToChange);
    }
    
    public int getFirstFarmersAmountOfPotatoes()
    {
        return firstFarmer.getAmountOfPotatoes();
    }
    
    public String getFirstFarmersName()
    {
        return firstFarmer.getName();
    }

    public int getSecondFarmersAmountOfPotatotes()
    {
        return secondFarmer.getAmountOfPotatoes();
    }
    
    public String getSecondFarmersName()
    {
        return secondFarmer.getName();
    }

    public int getThirdFarmersAmountOfPotatotes()
    {
        return thirdFarmer.getAmountOfPotatoes();
    }
    
    public String getThirdFarmersName()
    {
        return thirdFarmer.getName();
    }    
}
