import java.util.*;
class swapalternate
{
    public static void main(String args[])
    {
        int arr[] = {2,4,6,1,90,45};
         System.out.println("Array Before swap");
         System.out.println(Arrays.toString(arr));

         for(int i=0;i<arr.length-1;i=i+2)
         {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

         }
         System.out.println("Array After swapped");
         System.out.println(Arrays.toString(arr));


    }
}