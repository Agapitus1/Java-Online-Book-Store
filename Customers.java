public class Customers extends Records
{
    Customers()
    {}
    public void add()
    {
        records.add(new Customer(++id, In.readString("Enter name: "), 
        In.readString("Enter address: ")));
    }
    public Customer find(int id)
    {
        return (Customer)super.find(id);
    }
}