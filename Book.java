public class Book extends Record
{
    private double price;
    public Book(int id, String name, double price)
    {
        super(id, name);
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }
    public String toString()
    {
        return "book id is: "+id+", book name is: "+name+", and price is: "+price;
    }
}