import java.util.*;

class Panagram {
    static Scanner sc= new  Scanner(System.in);


    public static boolean isPanagram(String sentence)
    {

        String str = sentence.toLowerCase();

        boolean arr[] = new boolean[26];

        //System.out.println(Arrays.toString(arr));


        for(int i=0 ; i<str.length();i++)
        {
            char ch = str.charAt(i);

             if(ch>=97 && ch<=122)
                    arr[ch-97] = true;
                    System.out.println(Arrays.toString(arr));
        }


        for(int i=0 ; i<arr.length;i++)
        {
            if(arr[i] == false)
                return false;
        }

        return true;
    }
    
    public static void main(String[] args) {
        

        //the quick brown fox jumps over the lazy dog
        System.out.print("Enter One Sentence : ");
        String sentence = sc.nextLine();


       boolean ans = isPanagram(sentence);

       if(ans)
         System.out.println("it is panagram");
       else
        System.out.println("it is not panagram");
        
    }
}
