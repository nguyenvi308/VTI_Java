package com.nguyenvi.backend.exercise5;

import jdk.jfr.StackTrace;

import java.io.*;
import java.time.LocalDate;

public class LogUtil {

    private String filePath;

    public LogUtil(String filePath) {
        this.filePath = filePath;
    }

    public void writeLog(String reason, LocalDate exceptionDate , String message)
    {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath)))
        {
            String error =  exceptionDate.toString() +"\n"+
                    "      Error : " + reason + "\n" +
                    "      Message : " + message;
            bufferedWriter.append(error);
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    public void writeLog(MyException myException)
    {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath)))
        {
            String error =   myException.getDateException() +"\n"
                    +"      Error : " + myException.getMessage()+ "\n" +
                    "       StackTrace : " + myException.getStackTrace().toString();
            bufferedWriter.append(error);
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public  void readFromLog()
    {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath)))
        {
            String line = null;
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
        }catch (IOException e)
        {
          e.printStackTrace();
        }
    }
}
