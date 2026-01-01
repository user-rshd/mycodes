import java . util.*;
class leftrotate
{
    public static void main(String args[])
    {
        int arr [] = {10,20,30,40,50};
         System.out.println("Array Before swap");
         System.out.println(Arrays.toString(arr));
        int n = arr.length;

        int k = 2;
        for (int i=0; i<k; i++)
       
        {
              int first = arr[0];
            for(int j=1;j<n;j++ )
            {
                arr[j-1] = arr[j];  
            }

             arr [arr.length-1] = first;
        }
         System.out.println("Array After swap");
         System.out.println(Arrays.toString(arr));
    }
}