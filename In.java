//S121

import java.util.*;
import java.text.*;
public class In
{   
    private static Scanner in = new Scanner(System.in); 
    public static String readString(String msg)
    {
        System.out.println(msg);
        return in.nextLine();
    }
    public static double readDouble(String msg)
    {
        System.out.println(msg);
        double d = in.nextDouble();
        in.nextLine();
        return d;   
    }
        public static int readInt(String msg)
    {   
        System.out.println(msg);
        int i = in.nextInt();
        in.nextLine();
        return i;   
    }
    public static String nextLine()
    {   
        //System.out.println(msg);
        return in.nextLine();
    }
    public static char nextChar()
    {   
        return in.nextLine().charAt(0); 
    }  
    public static char nextUpperChar()
    {   
        return in.nextLine().toUpperCase().charAt(0); 
    }
    public static int nextInt()
    {   
        int i = in.nextInt();
        in.nextLine();
        return i;   
    }
    public static double nextDouble()
    {   
        //System.out.println(msg);
        double d = in.nextDouble();
        in.nextLine();
        return d;   
    }
    public static String formatted(double amount)
    {   
        DecimalFormat formatter = 
			new DecimalFormat("###,##0.00");
        return formatter.format(amount); 
    }
}
