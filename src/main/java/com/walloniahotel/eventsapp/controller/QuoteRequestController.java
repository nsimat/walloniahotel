package com.walloniahotel.eventsapp.controller;

import com.walloniahotel.eventsapp.domain.QuoteRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuoteRequestController {

    @GetMapping
    public String beginQuoteRequest(Model model){
        //Must add implementation later

        return "newQuote";
    }

    @PostMapping
    public String submitQuoteRequest(@ModelAttribute QuoteRequest formBean){

        //Must add implementation later
        return  "newQuoteConfirmation";
    }
}
