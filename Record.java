//S221

public class Record 
{
    protected int id;
    protected String name;
    public Record(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public boolean matches(int id)
    {
        return this.id == id;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public void show()
    {   
        System.out.println("\t" + toString());   
    }

    public String toString()
    {
        return id + " " + name;
    }
}
