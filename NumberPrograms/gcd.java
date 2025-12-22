import java.util.Scanner;
class gcd
{
    static Scanner sc = new Scanner(System.in);

    public static int gcd (int a,int b)
    {
        int n = (a>b)?a:b;
        int ans =1;
        for (int i =1; i<n ; i++)
        {
            if(a%i==0 && b%i==0)

                ans = i;
               
        }
         System.out.println(ans);
        return ans;
    }
    public static void main (String args[])
    {
        System.out.print("Enter First number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second number : ");
        int b = sc.nextInt();

        int res = gcd (a,b);
        System.out.println("The Gcd of " + a + " and " + b  + " is "  + res);


        

    }
}