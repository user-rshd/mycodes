import java.util.*;
class swapzeroandone
{
    public static void main (String args[])
    {
        int arr[] = {0,-2,0,9,8,0,0,7,6,-1,0};
        System.out.println("Array Before swap");
         System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int i = 0;
        int j = 0;
        while(j<n)
        {
            if(arr[j]!=0) // what you want last put in if condition
            {
                j++;
            }
            else
            {
               int temp = arr[i]; //what you want first swap that
                arr[i]= arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
        }
        System.out.println("Array After swapped");
         System.out.println(Arrays.toString(arr));


    }
}