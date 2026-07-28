import java.util.*;
class factorial
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String args[])
    {
        int n =sc.nextInt();
        int mul =1;
        for(int i=1;i<=n;i++)
        {
            mul=mul*i;
        }
        System.out.println(mul);
    }
}