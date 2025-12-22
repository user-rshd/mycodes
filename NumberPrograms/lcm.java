import java.util.Scanner;
class lcd
{
    static Scanner sc = new Scanner(System.in);

    public static int lcm (int a, int b)
    {
        int mul = a*b;

         return mul;
    }

    public static int gcd (int a, int b)
    {
         int n = (a>b)?a:b;
        int ans =1;
        for (int i =1; i<n ; i++)
        {
            if(a%i==0 && b%i==0)

                ans = i;
               
        }
        
        return ans;
    }
   
    public static void main(String args[])
    {
         System.out.print("Enter First number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second number : ");
        int b = sc.nextInt();

        int res = lcm (a,b)/ gcd(a,b);

        System.out.print("The LCM of " + a + " and " + b  + " is "  + res);


        
    }
}