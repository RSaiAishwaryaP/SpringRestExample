package com.resterrorjava.demo.controller;
import com.resterrorjava.demo.exception.ErrorResponse;
import com.resterrorjava.demo.exception.ResourceNotFoundException;
import com.resterrorjava.demo.exception.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

    @ControllerAdvice
    public class GlobalExceptionHandler {

        @ExceptionHandler(ResourceNotFoundException.class)
        public ResponseEntity<ErrorResponse> resourceNotFound(ResourceNotFoundException ex) {
            ErrorResponse response = new ErrorResponse();
            response.setErrorCode("NOT_FOUND");
            response.setErrorMessage(ex.getMessage());
            response.setTimestamp(LocalDateTime.now());


            ResponseEntity<ErrorResponse> unauthorizedException;(UnauthorizedException ) {

                    response.setErrorCode("UNAUTHORIZED"),
                    response.setErrorMessage(ex.getMessage()),
                    response.setTimestamp(LocalDateTime.now()),


            return new ResponseEntity<ErrorResponse>(response, HttpStatus.UNAUTHORIZED);
        }

    }
}
