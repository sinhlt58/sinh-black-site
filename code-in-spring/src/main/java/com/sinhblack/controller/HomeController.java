package com.sinhblack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public Map<String, Object> home(){
        Map<String, Object> a = new HashMap<String, Object>();
        a.put("sinh", "Cute");
        return a;
    }

}
