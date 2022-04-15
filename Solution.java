import java.util.*;

class MyCalculator 
{
    /*
    * Create the method long power(int, int) here.
    */
    public long power(int N, int P) throws Exception
    {
        if(N==0 && P==0)
            throw new Exception("n and p should not be zero.");
        else if(N<0 || P<0)
            throw new Exception("n or p should not be negative.");
        else
            return (long)(Math.pow(N, P));    
    } 
}

public class Solution 
{
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) 
	{
        while (in .hasNextInt()) 
		{
            int n = in .nextInt();
            int p = in .nextInt();
            try 
			{
                System.out.println(my_calculator.power(n, p));
            } 
			catch (Exception e) 
			{
                System.out.println(e);
            }
        }
    }
}