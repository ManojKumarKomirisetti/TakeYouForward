 import java.util.*;
public class DuplicateArraySortRecursion {
    //Removal of array deplicates
   //static int arr[] = {1,2,5,2,4,3,9,4,5,3,2,53,52,2,6,2,5,1,8,4,6,9,2252,4,1,2,5,52,2252};
   //static int[] arr = {2, 2, 3, 3, 5, 5, 7, 7, 9, 9};
   static int[] arr = {
    2, 2, 3, 3, 5, 5, 7, 7, 9, 9, 11, 11, 13, 13, 17, 17, 19, 19, 23, 23,
    29, 29, 31, 31, 37, 37, 41, 41, 43, 43, 47, 47, 53, 53, 59, 59, 61, 61,
    67, 67, 71, 71, 73, 73, 79, 79, 83, 83, 89, 89, 97, 97, 101, 101, 103, 103,
    107, 107, 109, 109, 113, 113, 127, 127, 131, 131, 137, 137, 139, 139, 149, 149,
    151, 151, 157, 157, 163, 163, 167, 167, 173, 173, 179, 179, 181, 181, 191, 191,
    193, 193, 197, 197, 199, 199, 211, 211, 223, 223, 227, 227, 229, 229, 233, 233,
    239, 239, 241, 241, 251, 251
};

   static ArrayList<Integer> al = new ArrayList<Integer>();
    public static void removeDuplicates(int l, int j) {
        
        if (arr.length <=1) {
            return ;
        }

        else{
            if(j>arr.length-1)
            {
               al.add(arr[arr.length-1]);
                return;
            }
            
           
          if(arr[l] != arr[j])
          {
            al.add(arr[l]);
          }
            
         removeDuplicates(l+1, j+1);

        }
        
        
    }
    

    public static void main(String [] Args)
    {
    
     Arrays.sort(arr);
     removeDuplicates(0,1);
//System.out.println("Val:"+arr[]);
     for(Integer k : al)
     {
            System.out.print(k + ", ");
     }
    
}
}
