import java.util.Scanner;

public class SubString
{
    public static String substringByMe(String str, int si, int ei)
    {
        String subStr = "";
        for(int i=si ; i<ei ; i++)
        {
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        System.out.println(str.subSequence(0, 4));
        System.out.println("smiley".substring(2, 4));

        System.out.println(substringByMe("smiley", 2, 4));
    }    
}
