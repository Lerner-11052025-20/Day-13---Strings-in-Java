import java.util.Scanner;

public class ToUpperCase 
{
    public static String convert(String str)
    {
        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i=1 ; i<str.length() ; i++)
        {
            if((i<str.length()-1) && str.charAt(i) == ' ') //&& i<str.length()-1  java.lang.StringIndexOutOfBoundsException: Index 14 out of bounds for length 14
            {
                sb.append(str.charAt(i));
                i++;    // java.lang.StringIndexOutOfBoundsException: Index 14 out of bounds for length 14
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else    sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String formFunStr;
        formFunStr = convert(sentence);
        System.out.print(formFunStr);
    }    
}
