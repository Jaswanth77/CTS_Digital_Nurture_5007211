
public class Product
{
    int productId;
    String productName;
    int quantity;
    int price;

    Product(int productID,String productName,int quantity,int price)
    {
        this.productId = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public int getProductId(){
        return this.productId;
    }
    public String getProductName()
    {
        return this.productName;
    }
    public int getQuantity()
    {
        return this.quantity;
    }
    public int getPrice()
    {
        return this.price;
    }
    public void setProductName(String productName)
    {
        this.productName = productName;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}