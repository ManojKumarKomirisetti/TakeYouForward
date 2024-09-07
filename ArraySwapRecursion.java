public class ArraySwapRecursion{
    //ArraySwap
public static int[] swap( int arr[],int l)
{
    if(l > (arr.length/2))
    {
     return arr;
    }
    else
    {
        int temp = arr[l];
        arr[l] = arr[arr.length-l-1];
        arr[arr.length-l-1] = temp;
        return swap(arr,l+1);
    }
}
    public static void main(String [] args)
    {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10,100};
        swap(arr,0);
        for(int i = 0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
    
}
