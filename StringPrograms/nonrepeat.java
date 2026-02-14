import java.util.*;
class nonrepeat
{
    static Scanner sc = new Scanner(System.in);
    public static char findch(String str)
    {
        for (int i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);
             if(str.indexOf(ch)==str.lastIndexOf(ch))
            return ch;
        }
       
        return '0';
    }
    public static void main (String args[])
    {
        System.out.print("Enter One String : ");
        String str = sc.next();
        char ans = findch(str);
         System.out.print(ans);



    }
    
}