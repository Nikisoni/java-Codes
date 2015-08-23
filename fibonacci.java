
/**
 * Write a description of class fabonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fibonacci
{
 public static int fib(int n)
 {
     if (n==1)
     {
       return 0;
    }
    else if (n==2)
    return 1;
    else
    {
        int a= fib(n-1)+fib(n-2)+1;
         
        return a;
    }
}
    public static void main(String args[])
    { 
        int n;
        System.out.println(fibonacci.fib(Integer.parseInt(args[0])));
       
}
}
