package com.resterrorjava.demo.controller;

import com.resterrorjava.demo.exception.ResourceNotFoundException;
import com.resterrorjava.demo.exception.UnauthorizedException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ErrorController {

    @RequestMapping(value = "/testExceptionHandling",
            method = RequestMethod.GET)
    public String testExceptionHandling(@RequestParam int code) {
        switch (code) {
            case 401:
                throw new UnauthorizedException("You are not authorized");
            case 404:
                throw new ResourceNotFoundException("Requested resource is not found.");

            default:
                return "Yeah...No Exception.";

        }


    }
}
