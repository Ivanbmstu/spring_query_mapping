package com.example.javaexample.ctrl;

import com.example.javaexample.ctrl.dto.QueryConstructorDTO;
import com.example.javaexample.ctrl.dto.QueryDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class TestCtrl {

    @GetMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String accountsAsPojo(QueryDTO filter) {
        return "success " + filter.getValues().get(0);
    }
    
    @GetMapping(value = "/ctr", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String accountsAsPojoConstructorBased(QueryConstructorDTO filter) {
        return "success " + filter.getValues().get(0);
    }
    
    @GetMapping(value = "/list", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String accountsListAsParam(@RequestParam List<String> values) {
        return "success " + values.get(0);
    }
}
