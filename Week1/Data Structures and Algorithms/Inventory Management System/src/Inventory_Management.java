import java.util.*;

public class Inventory_Management{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Adding new products
        Product p1 = new Product(1,"intel",20,10000);
        Product p2 = new Product(2,"qualcomm",20,15000);
        Product p3 = new Product(3,"amd",20,12000);

        InventoryManager.addProduct(p1);
        InventoryManager.addProduct(p2);
        InventoryManager.addProduct(p3);

        InventoryManager.displayProduct(1);
        InventoryManager.displayProduct(2);
        InventoryManager.displayProduct(3);

        System.out.println();

        // Updating the product details
        p1.setPrice(20000);
        p1.setQuantity(30);
        InventoryManager.updateProduct(p1);

        p2.setProductName("snapdragon");
        InventoryManager.updateProduct(p2);

        InventoryManager.displayProduct(1);
        InventoryManager.displayProduct(2);

        System.out.println();

        //Deleting product
        InventoryManager.deleteProduct(3);

        InventoryManager.displayProduct(3);

    }
}