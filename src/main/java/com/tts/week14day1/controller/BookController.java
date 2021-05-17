package com.tts.week14day1.controller;

import com.tts.week14day1.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {

    @GetMapping("/books")
    public String getBooks(Model model) {
        List<Book> bookList = List.of(
                new Book(1L, "title one", "author one"),
                new Book(2l, "title two", "author two")
        );
        model.addAttribute("books", bookList);
        return "home/greeting";
    }

    @GetMapping("/endpoint")
    @ResponseBody // this annotation tells spring to use the return as a response
    public String endPoint() {
        return "This is an endpoint!";
    }

//    This takes precedence the root
//    @GetMapping("/")
//    @ResponseBody
//    public String root(){
//        return "this is my root";
//    }






    }

