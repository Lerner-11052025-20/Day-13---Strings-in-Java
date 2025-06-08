import java.util.Scanner;

public class Palindrome 
{
    public static boolean check(String str)
    {
        for(int i=0 ; i<str.length()/2 ; i++)
        {
            if(str.charAt(i) != str.charAt(str.length()-1-i))   return false;
        }
        return true;
    }

    public static boolean checkWhile(String str)
    {
        int i = 0;
        int j = str.length()-1;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))  return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        System.out.println(check(str));
        System.out.println(checkWhile(str));
    }    
}
