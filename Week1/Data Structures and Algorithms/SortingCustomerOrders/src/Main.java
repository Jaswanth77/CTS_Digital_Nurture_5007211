public class Main {
    public static void main(String[] args) {

        Order[] orders1 = {
                new Order(1,"raj",65000),
                new Order(2,"santhosh",45000),
                new Order(3,"harish",35000),
                new Order(4,"naveen",70000),
                new Order(5,"gokul",50000),
        };

        //Sorting the orders according to total price using bubble sort
        SortingFn.BubbleSortTotalPrice(orders1);

        for(int i=0;i<orders1.length;i++)
        {
            System.out.println(orders1[i]);
        }

        Order[] orders2 = {
                new Order(1,"rajesh",58002),
                new Order(2,"siva",47003),
                new Order(3,"anirudh",33000),
                new Order(4,"rishwanth",82000),
                new Order(5,"shyam",66000),
        };

        System.out.println();

        //Sorting the orders according to total price using quick sort
        SortingFn.QuickSortTotalPrice(0,orders2.length-1,orders2);

        for(int i=0;i<orders2.length;i++)
        {
            System.out.println(orders2[i]);
        }
    }
}