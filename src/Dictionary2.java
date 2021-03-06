import java.util.Dictionary;

public class Dictionary2 extends Book2
{
    private int definitions;
    //Sets up the dictionary with the specified number of pages
    //(maintained by the Book parent class) and definitions
    public Dictionary2(int numPages, int numDefinitions)
    {
        super (numPages);
        definitions = numDefinitions;
    }
    //Prints a message using local and inherited values
    public void definitionMessage()
    {
        System.out.println("Number of definitions: " + definitions);
        System.out.println("Definitions per page: " + definitions / pages);
    }
}
