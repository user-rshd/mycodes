//Merge Two Sorted Array
import java.util.*;
class mergetwosortedarray
{
    public static void main(String args[])
    {
        int a[]={2,4,7,9};

        int b[]={1,3,5,8,10,17,19,20};
         System.out.println("Array Before Sort");
         System.out.println(Arrays.toString(a));
         System.out.println(Arrays.toString(b));


        int n = a.length;

        int m = b.length;

        int i=0,j=0,k=0;

        int res[] = new int [n+m];

        while( i<n && j<m)
        {
            if (a[i] < b[j])
            {
                res[k++] = a[i++];
                
                
            }
            else
            {
                res[k++] = b[j++];
            }

        }
        
        while (i<n)
        {
            res[k++] = a[i++];
        }
         
         while (j<m)
        {
            res[k++] = b[j++];
        }

        System.out.println("Array After Sort");

        System.out.println(Arrays.toString(res));
         
        
    }
}