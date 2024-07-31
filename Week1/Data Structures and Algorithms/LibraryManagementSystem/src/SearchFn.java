public class SearchFn {

    public static Book linearSearchTitle(Book[] books,String title)
    {
        for(Book b:books)
        {
            if(b.getTitle().equalsIgnoreCase(title))
            {
                return b;
            }
        }
        return null;
    }

    public static Book binarySearchTitle(Book[] books,String title)
    {
        int start = 0;
        int end = books.length-1;

        while(start <= end)
        {
            int mid = start+(end-start)/2;
            int compare = books[mid].getTitle().compareToIgnoreCase(title);

            if(compare == 0) {
                return books[mid];
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
