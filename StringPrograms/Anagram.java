import java.util.*;
class Anagram
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String args[])
    {
        System.out.print("Enter one String : ");
        String str1 = sc.next();
         System.out.print("Enter Second String : ");
        String str2 = sc.next();

        //STEP 1: CONVERTING TO LOWER CASE;
        String lower1 = str1.toLowerCase();
        String lower2 = str2.toLowerCase();

        //STEP2: CONVERTING STRING INTO ARRAY;

        char arr1[] = lower1.toCharArray();
        char arr2[]= lower2.toCharArray();

        //STEP3: SORT THE ARRAYS;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //step4: CONVERTING ARRAY TO STRING;
        String str3 = new String(arr1); 
        String str4 = new String(arr2);

        // STEP5: CHECK BOTH ARE EQUALS OR NOT;

        if(str3.equals(str4))
            System.out.println("It's an Anagram");
        else
             System.out.println("It's not an Anagram");
        
    }

}