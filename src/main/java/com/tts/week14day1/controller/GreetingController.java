package com.tts.week14day1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//add @Controller annotation
@Controller
public class GreetingController {
    // @Controller is an extension of @Component
// this means spring will pick it up and utilize the component
// @Controller does not automatically have every method's return
// act as a response body -- this is only true for @RestController

        @GetMapping("/hello")
        @ResponseBody // this annotation tells spring to use the return as a response
        public String helloWorld() {
            return "hello world!";
        }

        // since this method is used to resolve a template
        // we do not say @ResponseBody
        @GetMapping("/greeting")
        public String greeting() {
            return "greeting";
        }


    }


