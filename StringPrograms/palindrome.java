import java.util.Scanner;
class palindrome
{
    static Scanner sc = new Scanner(System.in);

    public static String reverse(String str)
    {
        String rev = "";
        
        for(int i = str.length()-1 ; i>=0 ; i--)
        {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        
        System.out.print("enter one string : ");
        String str = sc.nextLine();
        System.out.println("original string is : "+str);

       String rev =  reverse(str);

       System.out.println("reverse string is : "+rev);

       if(str.equalsIgnoreCase(rev))
          System.out.println("it is pallindrome");
        else
            System.out.println("it is not pallindrome");
    }
}