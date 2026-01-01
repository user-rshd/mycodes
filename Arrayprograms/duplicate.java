import java.util.*;
class duplicate
{

    public static int duplicate(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                return arr[i];
            }

        }
        return -1;
    }
    public static void main (String args[])
    {
        int arr[] ={1,2,3,8,4,5,6,8};
        int ans = duplicate(arr);
        System.out.println("The Duplicate Value is : "+ans);
    }
}