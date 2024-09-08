import java.util.*;
public class DuplicateStringSortRecursion{
   //Removal of string duplicates
   static String str = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";


   static ArrayList<String> al = new ArrayList<String>();

    public static void removeDuplicates(int l, int j) {
        
        if (str.length() <=1) {
            return ;
        }

        else{
            if(j>str.length()-1)
            {
                String s ="" + str.charAt(str.length()-1);
               al.add(s);
                return;
            }
            
           
          if(str.charAt(l) != str.charAt(j))
          {
            String s1 = "" + str.charAt(l);
            al.add(s1);       
        }
            
         removeDuplicates(l+1, j+1);

        }
        
        
    }
    

    public static void main(String [] Args)
    {
    
     removeDuplicates(0,1);
//System.out.println("Val:"+arr[]);
     for(String k : al)
     {
            System.out.print(k + ", ");
     }
    
}
}
