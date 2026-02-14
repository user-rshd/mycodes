import java.util.*;
class duplicate
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String args[])
    {
        System.out.print("Enter One String : ");
        String str =sc.next();
        String ans="";
        for (int i=0;i<str.length();i++)
        {
        char ch = str.charAt(i);
            if(ans.indexOf(ch)==-1)
            ans = ans+ch;
        }
        System.out.println(ans);
    }
}