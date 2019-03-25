package com.walloniahotel.eventsapp.controller;

import com.walloniahotel.eventsapp.domain.QuoteRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuoteRequestManagementController {

    @GetMapping(path = "/quoteRequests")
    public String listRequests() {

        return "quoteRequestList";
    }

    @GetMapping(path = "/quoteRequests", params = "eventType=wedding")
    public String listWeddingRequests() {

        return "quoteRequestList";
    }
    @GetMapping("/quoteRequest/{quoteId}")
    public ModelAndView viewQuoteRequest(@PathVariable int quoteId) {

        //We must refer to quoteId in next implementation
        QuoteRequest quoteRequestBean = new QuoteRequest();
        quoteRequestBean.setBugjet(500);
        quoteRequestBean.setEventType("wedding");

        ModelAndView mav = new ModelAndView();
        mav.addObject("quoteRequestBean", quoteRequestBean);
        mav.setViewName("quoteRequestDetail");

        return mav;
    }

    @GetMapping("/quoteRequest/social/{id}")
    public String viewRequestSocial(@PathVariable int id){

        String returnViewName = "quoteRequestSocialEventDetail";

        boolean someCondition = true;
        if(someCondition){
            returnViewName = "redirect:/quoteRequest/wedding/{id}";
        }

        return returnViewName;
    }

    @GetMapping
    @ResponseBody
    public QuoteRequest viewQuoteApi(){

        //We must add some implementation later
        QuoteRequest quoteRequest = new QuoteRequest();
        quoteRequest.setBugjet(56000);

        return quoteRequest;

    }

    @PostMapping("/quoteDetail")
    public String updateQuoteRequest(@ModelAttribute QuoteRequest formBean) {

        //We must implement a save of all of the form bean information

        return "quoteRequestDetail";
    }
}
