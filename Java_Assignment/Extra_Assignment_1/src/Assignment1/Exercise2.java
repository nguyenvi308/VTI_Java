package Assignment1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise2 {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,2,3,42,4,2,54321,42,132};
//        System.out.println("One time : ");
//        question1(arr);
//        System.out.println("Two time : ");
//        question2(arr);
//        System.out.println("Question 3: ");
//        question3(arr);
//        System.out.println("Question 4: ");
//        question4(343553);
//        System.out.println("Question 5: ");
//        question5(10);
//        System.out.println("Question 6: ");
//        question6(10);
//        System.out.println("Question 7: ");
//        System.out.println(question7_1(55,121));


//        System.out.println("Question 9");
//        System.out.println(question9_1(10));

        System.out.println("Question 10");
        question10();
    }


    public static void question1(int[] arr)
    {

        for (int i = 0 ; i< arr.length; i++)
        {
            int count = 1;
            for(int j = 0; j < arr.length;j++)
            {
                if(i != j && arr[i] == arr[j])
                {
                    count++;
                }
            }
            if (count == 1)
            {
                System.out.println(arr[i]);
            }
        }

    }
    public static void question2(int[] arr)
    {

        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i< arr.length; i++)
        {
            int count = 1;
            for(int j = 0; j < arr.length;j++)
            {
                if(i != j && arr[i] == arr[j])
                {
                    count++;
                }
            }
            if (count == 2)
            {
                if(list.contains(arr[i]))
                {

                }else
                {
                 list.add(arr[i]);
                }

            }
        }
        list.forEach(System.out::println);

    }
    public static void question3(int[] arr)
    {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++)
        {
            if (list.contains(arr[i]))
            {

            }else
            {
                list.add(arr[i]);
            }

        }
        for (int i = 0 ; i < list.size(); i++)
        {
            int count = 0;
            for(int j = 0; j < arr.length; j++)
            {
                if( list.get(i) == arr[j])
                {
                    count++;
                }
            }
            System.out.println(list.get(i)  + "  " + count);



        }
    }
    public static void question4(int number)
    {
        String str = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
        {
            String str1 = String.valueOf(str.charAt(i));
            int a = Integer.parseInt(str1);
            sum = sum + a ;
        }
        System.out.println(sum);

    }
    public static void question5(int n)
    {

        for (int i = 2; i <= n; i++)
        {
            if(i % 2 ==0)
            {

            }else
            {
                System.out.println(i);
            }
        }
    }
    public static void question6(int n)
    {

        int count = 0;
        int i = 2;
        while(count < n)
        {
            if(i%2 == 0)
            {
                i++;
                continue;

            }else
            {
                System.out.println(i);
                i++;
                count++;

            }
        }
    }
    public static void question7(int a , int b)
    {
        int gcd = 0;
        for(int i  = 1; i <= a && i <= b; i++)
        {
           if(a%i == 0 && b%i == 0)
           {
            gcd = i;
           }
        }
        System.out.println(gcd);
    }
    public static int question7_1(int a, int b)
    {
        int number = 1;
        while(true)
        {

            if(number%a == 0 && number%b == 0)
            {
                return number;
            }else
            {
               number++;
            }
        }

    }

    // Số 28 được phân tích thành 2 x 2 x 7
    public static String question8()
    {

        return null;
    }
    public static int question9(int n){
        int n0 = 0;
        int n1 = 1;
        int n2 = 0;
        int count = 0;
        for(int i = 2; i<= n;i++)
        {
            n2 = n1 + n0;
            count = n2;
            n0 = n1;
            n1 = n2;

        }
        return count;
    }
    public static int question9_1(int n)
    {
        // Base case
        if(n <= 1)
        {
            return n;
        }else
        {
            return (question9_1(n-1) + question9_1(n-2));
        }

    }

    public static void question10()
    {
        // it contains 6 number
        // 000000 -> 999999
        for(int i = 0; i < 100_00_00; i++)
        {
            if (checkQuestion10(i))
            {
                System.out.println(i);
            }
        }

    }
    public static boolean checkQuestion10(int n)
    {
        String str = String.valueOf(n);
        if (str.length() == 6)
        {
            String s1 = str.substring(0,2);
            String s2 = str.substring(2,4);
            String s3 = str.substring(4,6);
            String midS1 = str.substring(2,3);
            String midS2 = str.substring(3,4);

            if (s1.equals(s3) && !s1.equals(s2) && (midS1.equals(midS2)))
            {
                return true;
            }else
            {
                return false;
            }

        }else
        {
            return false;
        }

    }

    public static void question11(int n)
    {

    }





}
