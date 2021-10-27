//EnterpriseEdition class is a subclass of MicrosoftProduct class

public class EnterpriseEdition extends MicrosoftProduct
{
    private String clientCompanyName; // companyName is determined by datatype string
    private int pricePerUser; // pricePerUser is determined by datatype integer
    private int numberOfUser; // numberOfUser is determined by datatype integer
    private String activationDate; // activationDate is determined by datatype string
    private String licenseExpireDate; // licenseExpireDate is determined by datatype string
    private boolean isActivated; // isActivated is determined by datatype boolean
    private boolean isExpired; // isExpired is determined by datatype boolean
    
    public EnterpriseEdition(int productNo, String productName, int pricePerUser)
    {
        super(productNo, productName); //calling the super class constructor by passing parameters.
        this.pricePerUser = pricePerUser;
        this.clientCompanyName="";
        this.numberOfUser = 0;
        this.activationDate ="";
        this.licenseExpireDate="";
        this.isActivated = false;
        this.isExpired = false;
    }
    
    //Getter method
    public String getClientCompanyName() //Getter to return the value of a private field.
    {
        return clientCompanyName;
    }
    public int getPricePerUser() //Getter to return the value of a private field.
    {
        return pricePerUser;
    }
    public int getNumberOfUser() //Getter to return the value of a private field.
    {
        return numberOfUser;
    }
    public String getActivationDate() //Getter to return the value of a private field.
    {
        return activationDate;
    }
    public String getLicenseExpireDate() //Getter to return the value of a private field.
    {
        return licenseExpireDate;
    }
    public boolean getIsActivated() //Getter to return the value of a private field.
    {
        return isActivated;
    }
    public boolean getIsExpired() //Getter to return the value of a private field.
    {
        return isExpired;
    }
    
    //Setter method
    public void setPricePerUser(int pricePerUser) 
    {
        if(isActivated == true)
        {
            System.out.println("Sorry, it is not possible to change the price per user.");
        }
        else
        {
            this.pricePerUser=pricePerUser;
            System.out.println("Price per user is changed.");
        }
    }
    
    //Method to activate license
    public void activateLicense(String clientCompanyName, int numberOfUser, String activationDate,
    String licenseExpireDate,String activationKey)
    {
        if(isActivated == true){
            System.out.println("License has already been activated.");
            System.out.println("The name of the company is:" +clientCompanyName);
            System.out.println("The number of user is:" +numberOfUser);
        }
        else
        {
        this.clientCompanyName=clientCompanyName;
        this.numberOfUser=numberOfUser;
        this.activationDate=activationDate;
        this.licenseExpireDate=licenseExpireDate;
        super.setActivationKey(activationKey);
        int totalPrice=numberOfUser*pricePerUser;
        super.setPrice(totalPrice);
        this.isActivated=true;
        this.isExpired=false;
        System.out.println("License has been successfully activated.");
    }
}

 //Method to terminate the license activated
    public void terminateLicense()
    {
        if(isExpired == true)
        {
            System.out.println("The license is already terminated.");
        }
        else
        {
            this.clientCompanyName="";
            this.numberOfUser= 0;
            this.activationDate="";
            this.licenseExpireDate="";
            super.setActivationKey("");
            System.out.println("The license is successfully terminated.");
            this.isActivated=false;
            this.isExpired=true;
        }
    }
    
//Displaying the details
    public void productDetails()
    {
        super.productDetails();
            System.out.println("The price per user is:" +pricePerUser);
        if(isActivated == true){
                System.out.println("The name of the company is:" +clientCompanyName);
                System.out.println("The number of user is:" +numberOfUser);
                System.out.println("The license activation date is:" +activationDate);
                System.out.println("The license expiry date is:" +licenseExpireDate);
                System.out.println("The total price is:" +numberOfUser*pricePerUser);
                System.out.println("The activation status is true.");
            } 
            else {
                System.out.println("License has not been activated yet.");
            }
        }
    }


    
