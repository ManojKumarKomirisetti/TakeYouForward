public class StringPalindromeRecursion{
public static boolean pal( String Str,int i)
{
    if(Str.charAt(i) != Str.charAt(Str.length()-1-i))
    {
        return false;
    }

    else{
        if(i > Str.length()/2)
        {
            return true;
        }
    
    return pal(Str,i+1);
}
}
    public static void main(String [] args)
    {
        String Str = "MADAM";
        System.out.println(pal(Str,0)); 
        
    }
    
}
