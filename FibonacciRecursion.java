public class FibonacciRecursion {

    public static void fibonacci(int a, int b, int n)
    {
            if((a+b) > n)
            {
                return;

            }
            else
            {    
               System.out.println(a+b);
                fibonacci(b, (a+b), n);   
            }
    }
    public static void main(String [] args)
    {
        System.out.println(0+"\n"+1 );
        fibonacci(0,1,100);
    }
    
}
