import java.util.Scanner;
class binarytodecimal
{
    static Scanner sc = new Scanner(System.in);

    public static int binarytodecimal(int binary)
    {
        int base = 1;
        int decimal = 0;

        while(binary>0)
        {
            int ld = binary%10;
            decimal = decimal+ld*base;
            base = base*2;
            binary = binary/10;
        } 
        return decimal;
    }
    public static void main (String args[])
    {
        System.out.print("Enter One Binary Number : ");
        int binary = sc.nextInt();
        int res = binarytodecimal(binary);
        System.out.println("The Decimal Number Of " + binary + " is : " +res);

    }

}