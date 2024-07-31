import java.util.*;
class InventoryManager {

    static Map<Integer,Product> map = new HashMap<>();
    public static void addProduct(Product p)
    {
        map.put(p.productId,p);
    }
    public static void updateProduct(Product p)
    {
        if(map.containsKey(p.getProductId()))
        {
            map.put(p.getProductId(),p);
        }
        else {
            System.out.println("No matching product found");
        }
    }
    public static void deleteProduct(int pID)
    {
        if(map.containsKey(pID))
        {
            map.remove(pID);
        }
        else
        {
            System.out.println("No matching product found");
        }
    }
    public static void displayProduct(int pID)
    {
        if(map.containsKey(pID))
        {
            System.out.println("Product ID:"+pID);
            System.out.println("Product Name:"+map.get(pID).getProductName());
            System.out.println("Product Quantity:"+map.get(pID).getQuantity());
            System.out.println("Product Price:"+map.get(pID).getPrice());
        }
        else {
            System.out.println("Product with given id not exists");
        }
    }
}