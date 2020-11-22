package Assignment1;

public class Exercise3 {

    /**
     * Generate By CMT
     * Project: Add Here
     * Package: Add Here
     * <p>
     * User: Nguyen Vi
     * Date: Add Here
     * Time: Add Here
     * <p>
     * Created with IntelliJ IDEA
     * To change this template use File | Settings | File Templates.
     */
    public static void main(String[] args) {

        printStar(5);
        printStar1(5);
        printStar2(5);
        printStar3(5);

    }

    public static void printStar(int n)
    {
        for(int i = 0 ; i <n ; i++)
        {
            for(int j = 0 ; j <= i ; j ++)
            {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
    public static void printStar1(int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = n ; j > i  ; j--)
            {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
    public static void printStar2(int n)
    {
        /*
        * * * * *
          * * * *
            * * *
              * *
                *
         */
        for(int i = 0; i <= n ; i ++)
        {
            for(int j = 1 ; j <= n; j++)
            {
                if(j > i)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void printStar3(int n)
    {
        for(int i = 1; i <=n; i++)
        {
            for(int j = 1 ; j <=n; j++)
            {
                if(j > (n - i))
                {
                    System.out.print(" * ");
                }else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }
}
