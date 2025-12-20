import java.util.Scanner;
class perfect
{
    static Scanner sc = new Scanner (System.in);
    public static void main (String args[])
    {
         System.out.print("Enter One Number : ");
        int n = sc.nextInt();
       
        int sum = 0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum = sum+i;
            }
            

        }
        if (sum == n)
        {
            System.out.println("It's a Perfect Number");
        }
        else
        {
             System.out.println("Not a Perfect Number");
        }

    }
}