package com.nguyenvi.backend;

import java.util.List;

public class Exercise3 {


    public  <T> void printInfoT(T t)
    {
        System.out.println(t);

    }
    public  <T> void genericArray(List<T> t)
    {
        t.forEach(System.out::println);
    }


}
