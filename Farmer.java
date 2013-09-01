public class Farmer
{
    /**
     * Currently we only care about
     * their name,
     * amount of potatoes they own and
     * their price for the potatoes
     */
    private String name;
    private int amountOfPotatoes;
    private int price;
    
    public Farmer()
    {
        /**
         * Don't really need any constructors for this.
         */
    }
    
    public void setName(String hisName)
    {
        this.name = hisName;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setAmountOfPotatoes(int hisPotatoes)
    {
        this.amountOfPotatoes = hisPotatoes;
    }
    
    public int getAmountOfPotatoes()
    {
        return this.amountOfPotatoes;
    }
    
    public void setPrice(int hisPrice)
    {
        this.price = hisPrice;
    }

    public int getPrice()
    {
        return this.price;
    }
}
