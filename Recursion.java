import java.util.Scanner;
public class Recursion {
    static int count = 0;
    static int sum = 0;
    public static int function(int M, int N) {
        if (count >= N) {
            return sum;
        } else {
            sum += M ; // Add count to M, not double M
            count += 1;
            return function(M, N);
        }

}   

    public static void main(String Args[])
    {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter M and N Values");
           int M = sc.nextInt();
           int N= sc.nextInt();
        sc.close();
           System.out.println(function(M,N));
    }
}
