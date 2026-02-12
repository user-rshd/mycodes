import java.util.Scanner;
class isletter
{
    static Scanner sc = new Scanner (System.in);
    public static void main(String args[])
    {
    System.out.print("Enter one Name : ");
    String str = sc.nextLine();
    for(int i=0; i<str.length();i++)
    {
        char ch = str.charAt(i);
        System.out.println(ch + "->" + Character.isLetter(ch));

    }
    }

}