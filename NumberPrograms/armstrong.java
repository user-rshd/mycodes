
import java.util.Scanner;
class armstrong
{
    static Scanner sc = new Scanner(System.in);

    public static int count (int n)
    
    {
         int count = 0;
        while(n>0)
        {
           n = n/10;
            count++;
        }
        return count;
    }

    public static int fact (int power,int base)
        
    {
        int mul = 1;
        for(int i = 1 ;i<=power;i++)
        {
            mul = mul * base;

        }
        return mul;

    }

    public static void main (String args[])
    {
        System.out.print("Enter One Number : ");
        int n = sc.nextInt();
        int ognum = n;
        int sum = 0;
         int digits = count (n);
          System.out.println(digits);
       
        while(n>0)
        {
            

           
            
        
            int ld = n%10;

            sum = sum + fact (digits,ld);


            n = n/10;
        }
        System.out.println(sum);
        if (sum == ognum)
        {
            System.out.println("It's a Armstrong Number");
        }
        else
        {
            System.out.println("Not a Armstrong Number");
        }

    }
}