import java.util.Scanner;

public class ShortestPath 
{
    public static float shortestPath(String str)
    {
        int x1, y1, x2, y2;
        x1=y1=x2=y2=0;

        for(int i=0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);
            
            // if(ch == 'N' || ch == 'n')      y2++;
            // else if(ch == 'S' || ch == 's')      y2--;
            // else if(ch == 'E' || ch == 'e')      x2++;
            // else    x2--;

            switch (ch) {
                case 'N':
                case 'n':
                        y2++;
                        break;
                case 'S':
                case 's':
                        y2--;
                        break;
                case 'E':
                case 'e':
                        x2++;
                        break;
                default:
                        x2--;
                        break;
            }
        }

        float xPower = (float)(Math.pow(x2-x1, 2));
        float yPower = (float)(Math.pow(y2-y1, 2));  

        return (float)Math.sqrt(xPower+yPower);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        System.out.println(shortestPath(str));
    }    
}
