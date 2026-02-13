import java.util.*;
class casechange
{
    static Scanner sc = new Scanner(System.in);
    public static String changecase(String str)
    {
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>=65&&ch<=90)
            {
                ch+=32;
            }
            else if(ch>=97&&ch<=122)
            {
                ch-=32;

            }
            ans=ans+ch;
        }
        return ans;

    }

    public static void main(String args[])
    {
         System.out.print("Enter one String :");
        String str=sc.nextLine();
        //System.out.println(str);
        String ans = changecase(str);
        System.out.println(ans);


    }
}