public class Books extends Records
{
    public Books()
    {}
    public void add()
    {
        records.add(new Book(++id, In.readString("Enter book name: "),
        In.readDouble("Enter price: ")));
    }
    public Book find(int id)
    {
        return (Book)super.find(id);
    }
}