public class SumOfDigitsRecursion {

    public static void sumofDigits(int n, int sum)
    {
            if(n>0)
            {
                int x = n%10;
                sum = sum+x;
                n= n/10;
                sumofDigits(n,sum); 

            }
            else
            {
                System.out.println(sum);
                return ;
            }
    }
    public static void main(String [] args)
    {
        sumofDigits(12345, 0);
    }
    
}
