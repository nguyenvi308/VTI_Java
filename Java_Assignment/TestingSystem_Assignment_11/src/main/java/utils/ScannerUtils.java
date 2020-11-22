package utils;

import java.util.Scanner;

public class ScannerUtils {

    private static final Scanner scanner = new Scanner(System.in);


    public String nextLine()
    {

        return   scanner.nextLine();
    }
    public int inputInt() throws Exception {

        System.out.println("Enter Int:");
        try {
            int age = scanner.nextInt();
            if (age >=0) {
                return age;
            }else
            {
                throw new Exception("Please enter a number greater than 0");
            }
        }catch (Exception e)
        {
           throw  new Exception("Please enter number as int");
        }
    }

    public String inputString()
    {
        System.out.println("Enter String : ");
        String s = scanner.nextLine();
        return s;
    }

    public float inputFloat() throws Exception {
        System.out.println("Enter float :");
        try {
            float f = scanner.nextFloat() ;
            return f;
        }catch (Exception e)
        {
            throw new Exception("Please enter number as float !");
        }

    }
    public double inputDouble(String errorMessage) throws Exception {
        System.out.println("Enter double :");
        try {
            double d = scanner.nextDouble();
            return d;
        }catch (Exception e)
        {
            throw new Exception(errorMessage);
        }

    }


}
