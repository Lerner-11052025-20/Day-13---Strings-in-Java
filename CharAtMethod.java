import java.util.Scanner;

public class CharAtMethod 
{
    public static void printChar(String str)
    {
        for(int i=0 ; i<str.length() ; i++)
        {
            System.out.print(str.charAt(i)+ " ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(str.length()-1));
        // System.out.println(str.charAt(str.length())); array index out of bound error ni jem j error aavshe
        System.out.println("\n\n\n");
        printChar(str);
    }    
}
