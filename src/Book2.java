public class Book2
{
    public int pages;
    //sets up the book with the specified number of pages
    public Book2 (int numPages)
    {
        pages = numPages;
    }
    //Prints a message about the pages of this book
    public void pageMessage()
    {
        System.out.println("Number of pages: " + pages);
    }
}
