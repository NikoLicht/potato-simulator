
/**
 * Write a description of class Farmer here.
 * 
 * @author Lauritz
 * @version 0.0.1
 */
public class Farmer
{
    // instance variables - replace the example below with your own
    private String name;
    private int amountOfPotatoes;
    private int price;
    
    public Farmer()
    {
        // doesn't really need any constructors
    }
    
    public void setName(String hisName)
    {
        this.name = hisName;
    }
    
    public void setAmountOfPotatoes(int hisPotatoes)
    {
        this.amountOfPotatoes = hisPotatoes;
    }
    
    public int getAmountOfPotatoes(int hisPotatoes)
    {
        return this.amountOfPotatoes;
    }
    
    public void setPrice(int hisPrice)
    {
        this.price = hisPrice;
    }
}
