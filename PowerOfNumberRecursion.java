public class PowerOfNumberRecursion {
static int p=1;
    public static void power(int x, int n)
    {
            if(n>0)
            {
                
                 p = p * x;
                
                power(x,n-1); 

            }
            else
            {
                System.out.println(p);
                return ;
            }
    }
    public static void main(String [] args)
    {
        power(7,3);
    }
    
}
