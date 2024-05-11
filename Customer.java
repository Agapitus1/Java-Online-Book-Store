public class Customer extends Record
{
    private String address;
    public Customer(int id, String name, String address)
    {
        super(id, name);
        this.address=address;
    }
    public String toString()
    {
        return "Customer id is: " + id + ", name is: " + name +
        ", and adress is: "+address;
    }
}