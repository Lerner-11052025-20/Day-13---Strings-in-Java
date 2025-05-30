public class basicsOfString
{
    public static void main(String args[])
    {
        String str1 = "Deep";
        System.out.println(str1);
        String str2 = "DSA + dev";
        System.out.println(str2);
        str2 = "Deep";// change to kari j sakay pan te newer banshe orignal ma kay pan changes aavshe nahi j
        System.out.println(str1+ " " +str2);
        String combineStr = str1+ " " +str2;
        System.out.println(combineStr);

        String str3 = new String("Deep");
        System.out.println(str3);

        if(str1 == str2)    System.out.println(true);
        if(str1 == str3)    System.out.println(true);
        // if(str1.compareTo(str3))    System.out.println(true);
        // jo hu aahi ==0 nahi lahu to mane error malshe kemke compareTo mrthod mane either =0 >0 <0 value returns kare chhe 
        // jyare equals to mrthod mane only and only true || false j return kare chhe
        if(str1.equals(str3))    System.out.println(true);
        if(str1.compareTo(str3) == 0)    System.out.println(true);

        System.out.println(str1.length());
        System.out.println(combineStr.length());
        System.out.println("deep _ dsa _ dev ".length());

    }
}