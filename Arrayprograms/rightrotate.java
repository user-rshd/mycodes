import java . util.*;
class rightrotate
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
              int last = arr[n-1];
            for(int j=n-2;j>=0;j-- )
            {
                arr[j+1] = arr[j];  
            }

             arr [0] = last;
        }
         System.out.println("Array After swap");
         System.out.println(Arrays.toString(arr));
    }
}