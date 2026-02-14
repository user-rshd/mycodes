import java.util.*;
class reverse
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter one String : ");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j)
        {
            if(!Character.isLetter(arr[i]))
            i++;
            else if(!Character.isLetter(arr[j]))
            j--;
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                i++;
                j--;
            }
            

            
        }
        System.out.println(new String(arr));

    }
}