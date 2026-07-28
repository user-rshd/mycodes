import java.util.Scanner;
class fibonacci
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        int n = sc.nextInt();
        int a= 0;
        int b= 1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<n;i++)
        {
            c = a+b;
            a=b;
            b=c;
            System.out.println(c);
        }

    }
}