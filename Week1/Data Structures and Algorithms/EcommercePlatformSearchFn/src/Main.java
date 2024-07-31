import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = {
                new Product(1,"sneakers","shoes"),
                new Product(2,"apple","groceries"),
                new Product(3,"headset","accessories"),
                new Product(4,"shirts","clothing"),
                new Product(5,"carrot","groceries")
        };

        //Searching via various techniques

        Product p1 = SearchFn.LinearSearchByID(products,4);
        Product p2 = SearchFn.LinearSearchByName(products,"carrot");
        Product p3 = SearchFn.LinearSearchByCategory(products,"groceries");
        Product p4 = SearchFn.BinarySearchByID(products,1);
        Product p5 = SearchFn.BinarySearchByName(products,"headset");
        Product p6 = SearchFn.BinarySearchByCategory(products,"groceries");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());


    }
}