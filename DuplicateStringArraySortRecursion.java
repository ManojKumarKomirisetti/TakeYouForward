import java.util.*;
public class DuplicateStringArraySortRecursion{
   
   static String str[] = {
    "apple", "banana", "apple", "cherry", "banana", 
    "date", "fig", "cherry", "grape", "fig"
};


   static ArrayList<String> al = new ArrayList<String>();

    public static void removeDuplicates(int l, int j) {
        
        if (str.length <=1) {
            return ;
        }

        else{
            if(j>str.length-1)
            {
               al.add(str[str.length -1]);
                return;
            }
            
           
          if(str[l] != str[j])
          {
            
            al.add(str[l]);       
        }
            
         removeDuplicates(l+1, j+1);

        }
        
        
    }
    

    public static void main(String [] Args)
    {
    Arrays.sort(str);
     removeDuplicates(0,1);
//System.out.println("Val:"+arr[]);
     for(int k=0 ; k<al.size(); k++)
     {
            System.out.print(al.get(k) + ", ");
     }
    
}
}
