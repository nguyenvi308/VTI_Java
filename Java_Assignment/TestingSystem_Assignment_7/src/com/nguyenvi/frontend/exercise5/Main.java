package com.nguyenvi.frontend.exercise5;

import com.nguyenvi.backend.exercise1.Student;
import com.nguyenvi.backend.exercise5.LogUtil;
import com.nguyenvi.backend.exercise5.MyException;

import java.io.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1,"Nguyen Vi");
        Student s2 = new Student(2,"Hoang Minh");
        Student s3 = new Student(3,"Mai Anh");
        List<Student> students = Arrays.asList(s1,s2,s3);
        String filePath = "C:\\Users\\nguye\\Desktop\\Test4.txt";
        System.out.println("Write to file !");
        writeToFile(filePath , students);
//        System.out.println("Read from file !");
//        readFromFile(filePath);
        new LogUtil( "C:\\Users\\nguye\\Desktop\\Log.txt").readFromLog();





    }

    public  static void readFromFile(String filePath)
    {
        try
        {



            // Method 1
                    /*
                   FileInputStream fileInputStream = new FileInputStream(new File(filePath));
                   int data;
                   byte dataByte;
                   data = fileInputStream.read();
                   while (data != -1)
                   {
                       dataByte = (byte)data;
                       System.out.print((char)dataByte);
                       data = fileInputStream.read();
                   }
                   fileInputStream.close();
                     */
            // Method 2
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String text = null;
            while ((text = bufferedReader.readLine()) != null)
            {
                System.out.println(text);
            }
            bufferedReader.close();


        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public  static void writeToFile(String filePath, List<Student> students) {

        try {
            // Method 1
                    /*
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(filePath));
                    for (Student student : students)
                    {
                        byte[] bytes = student.toString().getBytes();
                        fileOutputStream.write(System.lineSeparator().getBytes());
                        fileOutputStream.write(bytes);
                    }
                    fileOutputStream.close();
                     */
            // Method 2
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
                    int count = 1;
                    for (Student student: students)
                    {
                        bufferedWriter.append("Student " + count + " \n");
                        bufferedWriter.append(student.toString());
                        bufferedWriter.append(System.lineSeparator().toString());
                        count++;
                    }

                    bufferedWriter.close();
                    throw  new MyException("Here is error to test" );

        }catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (MyException myException)
        {

            new LogUtil( "C:\\Users\\nguye\\Desktop\\Log.txt").
                    writeLog("Write to file not complete !" ,LocalDate.now(),"Please try again !");
        }


    }
}
