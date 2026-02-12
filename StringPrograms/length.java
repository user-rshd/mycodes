import java.util.Scanner;
class length
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter your Name :");
        String name = sc.nextLine();
        System.out.println("My name is : "+name);
        System.out.println("My name is : "+name.length());
        
    }
}