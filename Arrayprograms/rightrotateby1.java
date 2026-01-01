import java.util.*;
class rightrotateby1
{
    public static void main (String args[])
    {
        int arr []={10,20,30,40,50};
        int last =  arr [arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            
        
            arr[i+1]=arr[i];

        }
        arr[0]=last;
        System.out.println(Arrays.toString(arr));
    }
}