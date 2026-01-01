import java.util.*;
class reverse
{
    public static void main (String args[])
    {
         
        int arr[] = {10,20,30,40,50};
         System.out.println("Array Before Reverse");
           System.out.println(Arrays.toString(arr));

        int j = arr.length-1;

        for (int i=0;i<j;i++)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }

        System.out.println("Array After Reversed");
           System.out.println(Arrays.toString(arr));
    }
}