//S220
import java.util.*;
public class Root
{
    private Books books=new Books();
    private Customers customers= new Customers();
    private Stocks stocks=new Stocks();
    LinkedList<Invoice> invoices=new LinkedList<Invoice>();
    private int inId=0;
    public Root()
    {
        menu(); 
    }

    private void menu()
    {
        char action = readAction();
        switch (action)
        {
            case 'B': addBook(); break;
            case 'A': addStock(); break;
            case 'X': exit();
            break;
            case 'O': orderStock();
            break;
            case '?':help();
        }
    }

    private char readAction()
    {
        System.out.print("Please enter your choice (A, X, B, O, ?): ");
        return In.nextUpperChar();
    }

    private void addBook()
    {
        books.add();
        menu();
    }

    private void addStock()
    {
        int bookId=In.readInt("Enter book id");
        if(books.find(bookId)==null)
        {
            System.out.println("Unknown book");
        }
        else{
            stocks.add(books.find(bookId), In.readInt("Enter quantity: "));
            System.out.println("new stock added");
        }
        menu();
    }

    private void addCustomer()
    {
        customers.add();
        menu();
    }

    private void orderStock()
    {
        int custId=In.readInt("please enter customer id:");
        invoices.add(new Invoice(++inId, customers.find(custId), new Stocks()));
        invoices.get(inId-1).add(books.find(In.readInt("book num:")), 
        In.readInt("quantity:"));
        System.out.println("Stock added");
        menu();
    }

    private void help()
    {
        System.out.println("B for addbook, A for addstock, O for order, X for exit");
        menu();
    }

    private void exit()
    {
        System.out.println("are you sure? y/n");
        char ans=In.nextChar();
        if(ans == 'y')
        {
            System.out.println("good bye!");
        }
        else
        {
            menu();
        }
    }
}
