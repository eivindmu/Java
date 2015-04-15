
/**
 * Write a description of class AdvertisingJingle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdvertisingJingle extends AudioTrack
{
    // instance variables - replace the example below with your own
    private String product;
    private String company;
    
    /**
     * Constructor for objects of class AdvertisingJingle
     */
    public AdvertisingJingle(String title, String duration, Medium medium, String product, String company)
    {
        super(title, duration, medium);
        this.product = product;
        this.company = company;
    }
    /**
     * Constructor for objects of class AdvertisingJingle
     */
    public AdvertisingJingle(String title, String duration, Medium medium, String product, String company, String path, String filesize)
    {
        super(title, duration, medium, path, filesize);
        this.product = product;
        this.company = company;
    }
    /**
     * 
     */
    public String getProduct()
    {
        return product;
    }
    /**
     * 
     */
    public void changeProduct(String newProduct)
    {
        this.product = newProduct;
    }
    /**
     * 
     */
    public String getCompany()
    {
        return company;
    }
    /**
     * 
     */
    public void changeCompany(String newCompany)
    {
        this.company = newCompany;
    }
}

