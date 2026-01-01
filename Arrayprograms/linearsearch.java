import java.util.*;
class linearsearch
{
    public static int linear(int arr[],int key)
    {
        //int key1=12;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] ={10,20,12,30,40};
        int key=12;
        int value = linear(arr,key);
        System.out.println(value);
    }
}