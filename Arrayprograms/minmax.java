import java .util.*;
class minmax
{
    public static void main (String args[])
    {
        int arr [] = {10,20,100,43,45,98,200,678};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max = arr[i];
           

            if(arr[i]<min)
            min = arr[i];
           

        }
         System.out.println("THE MAX VALUE IS : "+max);
           System.out.println("THE MAX VALUE IS : "+min);

    }
}