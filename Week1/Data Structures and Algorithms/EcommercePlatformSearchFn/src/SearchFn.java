import java.util.*;
public class SearchFn {

    public static Product LinearSearchByID(Product[] products,int pID)
    {
        for(Product p:products)
        {
            if(p.getProductId() == pID)
            {
                return p;
            }
        }
        return null;
    }

    public static Product LinearSearchByName(Product[] products,String name)
    {
        for(Product p:products)
        {
            if(p.getProductName().equals(name))
            {
                return p;
            }
        }
        return null;
    }

    public static Product LinearSearchByCategory(Product[] products,String category)
    {
        for(Product p:products)
        {
            if(p.getCategory().equals(category))
            {
                return p;
            }
        }
        return null;
    }

    public static Product BinarySearchByID(Product[] products,int pID)
    {
        Arrays.sort(products,Comparator.comparing(Product::getProductId));
        int start = 0;
        int end = products.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            int compare = products[mid].getProductId();
            if(compare == pID)
            {
                return products[mid];
            }
            else if(compare > pID){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return null;
    }

    public static Product BinarySearchByName(Product[] products,String name)
    {
        Arrays.sort(products,Comparator.comparing(Product::getProductName));
        int start = 0;
        int end = products.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            int compare = products[mid].getProductName().compareTo(name);
            if(compare == 0)
            {
                return products[mid];
            }
            else if(compare > 0){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return null;
    }

    public static Product BinarySearchByCategory(Product[] products,String category)
    {
        Arrays.sort(products,Comparator.comparing(Product::getCategory));
        int start = 0;
        int end = products.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            int compare = products[mid].getCategory().compareTo(category);
            if(compare == 0)
            {
                return products[mid];
            }
            else if(compare > 0){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return null;
    }



}
