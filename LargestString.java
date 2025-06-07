import java.util.Scanner;

public class LargestString 
{
    public static void largest(String fruits[])
    {
        String max = fruits[0];
        for(int i=1 ; i<fruits.length ; i++)
        {
            if(max.compareTo(fruits[i]) < 0)    max = fruits[i];
        }
        System.out.println(max);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String fruits[] = new String[5];
        
        for(int i=0 ; i<fruits.length ; i++)
        {
            fruits[i] = sc.next();
        }

        largest(fruits);
    }    
}
