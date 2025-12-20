class name
{
    public static void main (String args[])throws Exception
    {
        int n = 5;
        for (int i=0;i<n;i++)
        {
            //AFRAR
            //A
            for (int j=0;j<n;j++)
            {
                if(j==0||i==0||j==n-1||i==n/2)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                   
                }
                 Thread.sleep(50);

            }
            System.out.print("  ");
              //B
            for (int j=0;j<n;j++)
            {
                if(j==0||i==0||i==n/2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                Thread.sleep(50);
            }
            System.out.print("  ");
            //R
             for (int j=0;j<n;j++)
            {
                if(i==0||j==0||i==n/2||(j==n-1&&i<=n/2)||(i==j&&i>=n/2))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                Thread.sleep(50);
            }
            System.out.print("  ");

             //A
             for (int j=0;j<n;j++)
            {
                if(j==0||i==0||j==n-1||i==n/2)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                   
                }
                 Thread.sleep(50);

            }
            System.out.print("  ");

             //R
                for (int j=0;j<n;j++)
            {
                if(i==0||j==0||i==n/2||(j==n-1&&i<=n/2)||(i==j&&i>=n/2))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                Thread.sleep(50);
            }
            System.out.print("  ");

            System.out.println();
        }
          System.out.println();

         for(int i=0;i<n;i++)
         {
            //RASHEED
            //R
             for (int j=0;j<n;j++)
            {
                if(i==0||j==0||i==n/2||(j==n-1&&i<=n/2)||(i==j&&i>=n/2))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                Thread.sleep(50);
            }
            System.out.print("  ");

             //A
              for (int j=0;j<n;j++)
            {
                if(j==0||i==0||j==n-1||i==n/2)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                   
                }
                 Thread.sleep(50);

            }
            System.out.print("  ");

                //S

                 for (int j=0;j<n;j++)
            {
                if(i==0||i==n-1||i==n/2||(j==0&&i<=n/2)||(j==n-1&&i>=n/2))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                   
                }
                 Thread.sleep(50);

            }
            System.out.print("  ");

                //H
                 for (int j=0;j<n;j++)
            {
                if(j==0||j==n-1||i==n/2)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                   
                }
                 Thread.sleep(50);

            }
            System.out.print("  ");

              //E
               for (int j=0;j<n;j++)
            {
                if(j==0||i==0||i==n/2||i==n-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                   
                }
                 Thread.sleep(50);

            }
            System.out.print("  ");

                //E
                 for (int j=0;j<n;j++)
            {
                if(j==0||i==0||i==n/2||i==n-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                   
                }
                 Thread.sleep(50);

            }
            System.out.print("  ");

                //D
                 for (int j=0;j<n;j++)
            {
                if(j==0||(i==0 && j<n-1)||(i==n-1 && j<n-1)||(j==n-1 && i!=n-1&& i!=0))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                   
                }
                 Thread.sleep(50);

            }
            System.out.print("  ");

             System.out.println();

         }
    }
}
 


