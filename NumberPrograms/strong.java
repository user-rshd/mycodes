import java.util.Scanner;
class strong
{
    static Scanner sc = new Scanner(System.in);

    public static int fact(int f)
    {
       int mul = 1;
        for(int i=1;i<=f;i++)
        {

            mul = mul*i;
        }
        return mul;

    }
    public static void main(String args[])
    {
        System.out.print ("Enter One Number : ");
        int n = sc.nextInt();
        int ognum = n;
        int sum = 0;
        while(n>0)
        {
            int ld = n%10;

            sum = sum + fact(ld);


            n = n/10;
        }

        if(sum == ognum)
        {
            System.out.println("It's a Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }


    }
}