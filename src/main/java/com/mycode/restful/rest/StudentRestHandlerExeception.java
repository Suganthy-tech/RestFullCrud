package com.mycode.restful.rest;

import com.mycode.restful.pojo.StudentErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestHandlerExeception {
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleStudentNotFoundstudentId(StudentNotFoundExeception Exe){
        StudentErrorResponse s=new StudentErrorResponse(Exe.getMessage(), HttpStatus.NOT_FOUND.value(),System.currentTimeMillis());
        return new ResponseEntity<>(s,HttpStatus.NOT_FOUND);

    }
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleExeception(Exception Exe){
        StudentErrorResponse s=new StudentErrorResponse(Exe.getMessage(), HttpStatus.BAD_REQUEST.value(),System.currentTimeMillis());
        return new ResponseEntity<>(s,HttpStatus.BAD_REQUEST);

    }
}
