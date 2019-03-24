package com.walloniahotel.eventsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteRequestController {

    @GetMapping
    public String beginQuoteRequest(){
        //Must add implementation later

        return "newQuote";
    }

    public String submitQuoteRequest(){

        return  "";
    }
}
