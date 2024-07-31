import java.util.OptionalDouble;

public class SortingFn {

    public static void BubbleSortTotalPrice(Order[] orders)
    {
        int n = orders.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(orders[j].getTotalPrice() > orders[j+1].getTotalPrice())
                {
                    Swap(j,j+1,orders);
                }
            }
        }
    }

    public static void Swap(int i,int j,Order[] orders)
    {
        Order temp = orders[i];
        orders[i] = orders[j];
        orders[j] = temp;
    }

    public static void QuickSortTotalPrice(int start,int end,Order[] orders)
    {
        if(start < end)
        {
            int part = partition(orders,start,end);
            QuickSortTotalPrice(start,part-1,orders);
            QuickSortTotalPrice(part+1,end,orders);
        }
    }

    public static int partition(Order[] orders,int start,int end)
    {
        double pivot = orders[end].getTotalPrice();
        int i = start - 1;
        for(int j=start;j<end;j++)
        {
            if(orders[j].getTotalPrice() <= pivot)
            {
                i++;
                Swap(i,j,orders);
            }
        }
        Swap(i+1,end,orders);
        return i+1;
    }
}
