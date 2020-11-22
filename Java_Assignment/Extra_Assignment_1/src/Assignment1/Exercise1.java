package Assignment1;

public class Exercise1 {

    public static void question1(double  a)
    {
       double inch = a*0.39;
       double foot = inch*12;
        System.out.println(a + " (cm)");
        System.out.println(inch + " (inch)");
        System.out.println(foot+ " (foot)");
    }

    public static void main(String[] args) {
        question2(7200);

    }

    public static String  question2(int seconds)
    {
        int hour = seconds/3600;
        int minute = ((seconds)%3600)/60;
        int second  = seconds - (hour *3600) - (minute*60);
        if(hour <10 && minute <10 && second < 10)
        {
            return "0"+hour + ":" + "0"+minute+ "0"+second;
        }
        if(hour  < 10)
        {
            return "0"+hour + ":" + minute + ":" + second;

        }
        if(second  < 10)
        {
            return hour + ":" + minute + ":" +"0" +second;

        }else
        {
            return "0"+hour + ":" + minute + ":" + second;

        }

    }


    public int question3(int[] arr)
    {

        int max = arr[0];
       for (int i = 1; i < arr.length ; i++)
       {
           if(max < arr[i])
           {
               max = arr[i];
           }
       }
       return max;

    }
    public void question4(int a , int b)
    {
        if(a - b > 0)
        {
            System.out.println("So thu nhat lon hon so thu hai ");
        }else if( a- b <  0)
        {
            System.out.println("So thu hai lon hon so thu nhat ");
        }else {
            System.out.println("Hai so bang nhau ");
        }

    }

    public boolean question5(int a , int b)
    {
        if(a%b == 0)
        {
            return true;
        }else
        {
            return false;
        }
    }


    public void question6(double a)
    {
        if(a > 9.0 )
        {
            System.out.println("Xuat Sac");
        }
    }

}
