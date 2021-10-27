
/**
 * MicrosoftProduct class is a Super class
 *
 * @author (Pratigya Rana)
 * @version (0.01)
 */
public class MicrosoftProduct
{
   private int productNo; // productNo is determined by datatype integer
   private String productName; // productName is determined by datatype string
   private String activationKey; // activationKey is determined by datatype string
   private int price; // price is determined by datatype integer
   
   public MicrosoftProduct(int productNo, String productName) // creating constructor that accepts parameter
   {
       this.productNo = productNo;
       this.productName = productName;
       this.activationKey ="";
       this.price = 0;
    }
    
    //Getter method
    public int getProductNo() //Getter to return the value of a private field
    {
        return productNo;
    }
    public String getProductName() //Getter to return the value of a private field
    {
        return productName;
    }
    public String getActivationKey() //Getter to return the value of a private field
    {
        return activationKey;
    }
    public int getPrice() //Getter to return the value of a private field
    {
        return price;
    }
    
    //Setter method
    public void setActivationKey(String activationKey) // Setter to set the value of a private field
    {
        this.activationKey = activationKey;
    }
    public void setPrice(int price) //Setter to set the value of a private field
    {
        this.price = price;
    }
    
    //Displaying the details
    public void productDetails(){
         System.out.println("The Product number is: "+productNo);
         System.out.println("The Product name is: "+productName);
         if(activationKey!=""){
             System.out.println("The activation key ="+activationKey);
            }
            if(price !=0){
                System.out.println("The price of product ="+price);
            }
            
    }
}

