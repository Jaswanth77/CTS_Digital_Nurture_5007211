public class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId,String title,String author)
    {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
    }

    public int getBookId()
    {
        return this.bookId;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public String toString()
    {
        return "Book (bookId=" + bookId + ", title=" + title + ", author=" + author + ")";
    }
}
