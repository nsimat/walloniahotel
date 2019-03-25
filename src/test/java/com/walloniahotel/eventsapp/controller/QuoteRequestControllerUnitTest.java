package com.walloniahotel.eventsapp.controller;

import com.walloniahotel.eventsapp.domain.QuoteRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(QuoteRequestController.class)
public class QuoteRequestControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    private QuoteRequestController quoteRequestController;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetForm() throws Exception {
        //We will simulate getting a new form for the user to fill in to test the "Get Request".
        mockMvc.perform(get("/newQuote"))
                 .andExpect(status().isOk())
                 .andReturn();
    }

    @Test
    public void testPostQuoteForm() throws Exception {
        QuoteRequest aFormBean = new QuoteRequest();
        //We simulate the form submit by testing the "Post Request".
        mockMvc.perform(post("/newQuote", aFormBean))
                 .andExpect(status().isOk())
                 .andReturn();
    }
}
