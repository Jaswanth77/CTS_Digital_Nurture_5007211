public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1,"Dune","Frank Hebert"),
                new Book(2,"Rich dad Poor dad","Robert kiyosaki"),
                new Book(3,"Harry Potter","J.K.Rowling")
        };

        //Linear search by title
        Book b1 = SearchFn.linearSearchTitle(books,"harry potter");
        Book b2 = SearchFn.binarySearchTitle(books,"dune");

        if(b1 == null){
            System.out.println("The book with title not exist");
        }
        else{
            System.out.println(b1);
        }

        if(b2 == null){
            System.out.println("The book with title not exist");
        }
        else{
            System.out.println(b2);
        }
    }
}