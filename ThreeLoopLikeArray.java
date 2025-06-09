import java.util.Scanner;

public class ThreeLoopLikeArray 
{
    public static void printChar(String str)
    {
        for(int i=0 ; i<str.length() ; i++)
        {
            System.out.println(str.charAt(i));
            for(int j=i ; j<str.length() ; j++)
            {
                for(int k=i ; k<=j ; k++)
                {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        printChar(str);
    }    
}
