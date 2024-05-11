public class Invoice
{
    int id;
    Customer customer;
    Stocks item;
    double owes;
    public Invoice(int id, Customer customer, Stocks stocks)
    {
        this.id=id;
        this.customer=customer;
        this.item=stocks;
        this.owes=0;
    }

    public void add(Book book, int qty)
    {
        item.add(book,qty);
    }

    public double freight()
    {
        if(item.size()<=6)
        {
            return 10;
        }
        else{
            return 20;
        }
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public String toString()
    {
        String res="";
        for(int i=0;i<item.size();i++)
        {
            res+=item.toString();
        }
        return res;
    }
    public void show()
    {
        System.out.println(toString());
    }
}
