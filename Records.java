//S121

import java.util.*;
public class Records
{
    protected LinkedList<Record> records = new LinkedList<Record>();
    protected int id = 0;
    protected void add(Record record)
    {
        records.add(record);
    }

    protected void remove(Record record)
    {
        records.remove(record);
    }

    public Record find(int id)
    {   
        for(Record record : records)
        {  
            if (record.matches(id))
                return record;  
        }
        return null;    
    } 

    public boolean found(int id)
    {
        if(find(id) != null)
        {
            return true;
        }
        return false;
    }

    public int readInt(String message)
    {   
        System.out.print("\t" + message + ": ");
        return In.nextInt();    
    }

    public double readDouble(String message)
    {   
        System.out.print("\t" + message + ": ");
        return In.nextDouble();    
    }

    public String readString(String message)
    {   
        System.out.print("\t" + message + ": ");
        return In.nextLine();    
    }

    public int size()
    {   
        return records.size();    
    }

    public void show()
    {
        for(Record record : records)
        {
            record.show();
        }
    }
}
