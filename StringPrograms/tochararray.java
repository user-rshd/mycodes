import java.util.Scanner;
class tochararray
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter one name to change into Character : ");
        String str1 = sc.nextLine();
        
        //CONVERTING STRING TO CHARACTER ARRAY

         char ch[] = str1.toCharArray();
         System.out.println(ch);
         for(int i=0;i<ch.length;i++)
         {
            System.out.println(ch[i]);
         }

       

       //CONVERTING CHARACTER ARRAY TO STRING

        String str2 = new String(ch);
        System.out.print(str2);

    }
}
