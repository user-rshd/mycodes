import java.util.Scanner;
class index
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter one Name :");
        String str1 = sc.nextLine();
        System.out.println(str1.indexOf('a'));
        //lastIndexOf;
        System.out.println(str1.lastIndexOf('r'));
    }
}