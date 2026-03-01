package com.mycode.restful.rest;

public class StudentNotFoundExeception extends RuntimeException{

    public StudentNotFoundExeception(String message) {
        super(message);
    }

    public StudentNotFoundExeception(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundExeception(Throwable cause) {
        super(cause);
    }
}
