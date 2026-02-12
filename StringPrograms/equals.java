import java.util.Scanner;
class equals
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter one Name : ");
        String str1 = sc.nextLine();
         System.out.print("Enter one Name : ");
        String str2 = sc.nextLine();
        if(str1.equals(str2))
        {
            System.out.println("Names are Equal");

        }
        else{
             System.out.println("Names are not Equal");


        }
        //equalsIgnorance;
         if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("Names are Equal");

        }
        else{
             System.out.println("Names are not Equal");


        }



    }

}
