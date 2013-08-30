
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

    Farmer[] listOfFarmers = new Farmer[3];
    
    public Game()
    {
        listOfFarmers[0] = new Farmer();
        listOfFarmers[0].setName("Torben");
        listOfFarmers[0].setAmountOfPotatoes(60);
        listOfFarmers[0].setPrice(10);
        
        listOfFarmers[1] = new Farmer();
        listOfFarmers[1].setName("Henning");
        listOfFarmers[1].setAmountOfPotatoes(80);
        listOfFarmers[1].setPrice(15);
        
        listOfFarmers[2] = new Farmer();
        listOfFarmers[2].setName("Tobias");
        listOfFarmers[2].setAmountOfPotatoes(30);
        listOfFarmers[2].setPrice(20);
    }
    
    public void removePotatoesFromFarmer(int i, int amountOfPotatoesToChange)
    {
        listOfFarmers[i].setAmountOfPotatoes(getFarmersAmountOfPotatoes(i) - amountOfPotatoesToChange);
    }
    
    public int getFarmersAmountOfPotatoes(int i)
    {
        return listOfFarmers[i].getAmountOfPotatoes();
    }
    
    public String getFarmersName(int i)
    {
        return listOfFarmers[i].getName();
    }
}
