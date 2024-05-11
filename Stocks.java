public class Stocks extends Records
{
    public Stocks()
    {
    }
    public void add(Book book, int qty)
    {
        records.add(new Stock(book, qty));
    }
    public Stock find(Book book)
    {
        for(Record record: records)
        {
            if(((Stock)record).matches(book))
            {
                return (Stock)record;
            }
        }
        return null;
    }
    public Stock find(int id)
    {
        return (Stock)super.find(id);
    }
}