public class Recursiontest {
    static int count = 1;
    
    public static void function() 
    {
        if(count==5)
        {
            System.exit(0);
        }
        System.out.println("Manoj Kumar");
        count += 1;
        function();
    }   

    public static void function1(int i,int n) 
    {
         if(i<=n)
         {
        System.out.println(i);
        function1(i+1,n);
          }

          else
          {
            return;
          }
    }   
    public static void function2(int i,int n) 
    {
         if(n>=i)
         {
        System.out.println(n);
        function2(i,n-1);
          }

          else
          {
            return;
          }
    }   
    public static void function3(int i,int n) 
    {
         if(n>0)
         {
          function3(i,n-1);
         }
         else{
          System.out.println(i);
         
         }
    }   

    public static void main(String Args[])
    {
           //function();
           function3(1,100);

    }
}
