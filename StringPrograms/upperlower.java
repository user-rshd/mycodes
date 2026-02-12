import java.util.Scanner;
class upperlower

{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter one Name :");
        String str1 = sc.nextLine();
        //toUpperCase
        System.out.println(str1.toUpperCase());
        //toLoweCase;
        System.out.println(str1.toLowerCase());
    }
}