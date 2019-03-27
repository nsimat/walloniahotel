package com.walloniahotel;

import com.walloniahotel.eventsapp.controller.QuoteRequestManagementController;
import com.walloniahotel.eventsapp.domain.QuoteRequest;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@ControllerAdvice(assignableTypes = {
        QuoteRequest.class,
        QuoteRequestManagementController.class
})
public class QuoteRequestManagementAdvice {


    public void initBinder(WebDataBinder binder) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);

        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    public ResponseEntity<String> handle(IOException ex) {
        //Implement some rules here

        return null;

    }
}
