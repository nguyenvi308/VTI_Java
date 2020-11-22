package com.nguyenvi.backend.exercise5;

import java.time.LocalDate;
import java.util.Date;

public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }
    public LocalDate getDateException()
    {
        return LocalDate.now();
    }
}
