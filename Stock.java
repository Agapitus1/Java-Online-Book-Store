public class Stock extends Record
{
    private Book book;
    private int qty;
    public Stock(/*int id, String name,*/ Book book, int qty)
    {
        super(0, "");
        this.book=book;
        this.qty=qty;
    }

    boolean matches(Book book)
    {
        boolean res=false;
        if(book==this.book)
        {
            res=true;
        }
        return res;
    }

    public void add(int qty)
    {
        this.qty+=qty;
    }

    boolean has(int qty)
    {
        boolean res=false;
        if(this.qty>=qty)
        {
            res=true;
        }
        return res;
    }

    public void buy(int num)
    {
        this.qty-=num;
    }

    public double getPrice()
    {
        return book.getPrice()*this.qty;
    }

    public String toString()
    {
        return /*"Id is: "+id+" name is: "+name+" */"quantity is: " + qty+
        book.toString();
    }
}