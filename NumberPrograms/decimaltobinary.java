import java.util.Scanner;
class decimaltobinary
{
    static Scanner sc = new Scanner(System.in);

    public static String decimaltobinary(int decimal)
    {
        String binary = "";
        

        while(decimal > 0)
        {
            int rem = decimal%2;
            binary = rem + binary;
            decimal = decimal/2;

        }
        return binary;

    }
    public static void main (String args[])
    {
        System.out.print("Enter One Decimal Number : ");
        int decimal = sc.nextInt();
        String res = decimaltobinary(decimal);

        System.out.println("The Binary Number Of " + decimal + " is : " +res);
    }
}