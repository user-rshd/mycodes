import java .util.*;
class sorted
{
    public static boolean issorted(int arr[])
    {
        for (int i =0 ; i<arr.length-1;i++)
        {
        if (arr[i]>arr[i+1])
            return false;
        }
        return true;
    }
    

    public static void main (String args[])
    {
        int arr[] = {10,20,30,40,50};
         int arr2[] = {1,0,2,9,5,4};


        System.out.println(issorted(arr));
        System.out.println(issorted(arr2));
    }
}