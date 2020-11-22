package com.nguyenvi.TestingSystem_Assignment_3;

import com.nguyenvi.TestingSystem_Assignment_1.entities.Group;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {
    public static void main(String[] args) {
        //question7("nguyen van vi");
//        List<String> strings = Arrays.asList("fafaJavaxa" , "javaaxaf" ,  "afafajava" , "Javaafabfgaf",  "dagfagfJava",
//                "ghksgkfhsdk" ,
//                "jafha");
//        testQuestion9(strings);
        System.out.println(question10("vi" , "iv"));
    }

    public static int question1(String str)
    {

        String newStr = str.replaceAll("\s" , "");
        return newStr.length();

    }
    public static String question2(String str1 , String str2)
    {
        String str3 = str1.concat(str2);
        return str3;
    }
    public static String question3(String str)
    {


        if(str.charAt(0) == str.toUpperCase().charAt(0))
        {
            return str.toUpperCase();
        }else
        {
            return str;
        }
    }
    public static void question4(String str)
    {
        for(int i = 0; i< str.length() ; i++)
        {
            System.out.println("Character at " + i + " is : " + str.charAt(i));
        }
    }
    public static String question5(String lastName , String firstName)
    {
        String fullName = lastName.concat(firstName);
        return fullName;
    }
    public static void question6(String fullName)
    {
        String[] part = fullName.split("\s");
        System.out.println("Last Name is :  " + part[0]);
        System.out.println("Mid Name is : " + part[1]);
        System.out.println("First Name is : " + part[2]);

    }
    public static void question7(String str)
    {
        // Norm 1
        // Norm 2
        StringBuilder strBuilder = new StringBuilder();
        String[] norm1 = str.split("\s");
        for(int i = 0 ; i < norm1.length; i ++)
        {
            // Method 1
            String s = norm1[i].replaceFirst(String.valueOf(norm1[i].charAt(0)), norm1[i].substring(0,1).toUpperCase());
            // Method 2
            // String s1 = norm1[i].replaceFirst(norm1[i].substring(0 , 1), norm1[i].substring(0,1).toUpperCase());
            strBuilder.append(s);
            strBuilder.append(" ");

        }
        System.out.println(strBuilder.toString());




    }
    public static  void question8(List<Group> groups, String groupName)
    {
        for (Group group: groups)
        {
            if (group.getGroupName().equals(groupName))
            {
                System.out.println(group);
            }
        }
    }
    public  static void question9(List<Group> groups)
    {
        String regex = "Java";
        Pattern javaPatter = Pattern.compile(regex);

        for (Group group : groups)
        {
            Matcher m = javaPatter.matcher(group.getGroupName());
            if (m.find())
            {
                System.out.println(group.getGroupName());
            }
        }
    }
    // Test fot question 9
    public  static void testQuestion9(List<String> groups)
    {
        String regex = "Java";
        Pattern javaPatter = Pattern.compile(regex);

        for (String group : groups)
        {
            Matcher m = javaPatter.matcher(group);
            if (m.find())
            {
                System.out.println(group);
            }
        }
    }

    public static boolean question10(String str , String str1)
    {
        int count =0 ;
        for (int i = 0 ; i < str.length() ; i++)
        {
            // 2
            // v i
            // i v
            int j = (str.length()-1) - i;
                if (str.charAt(i) == str1.charAt(j)) {
                    count++;

                }
            }

        if (count == str.length())
        {
            return true;
        }else
        {
            return false;
        }
    }
}
