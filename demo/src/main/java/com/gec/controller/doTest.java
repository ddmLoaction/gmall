package com.gec.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class doTest {

    @RequestMapping("/doTest")
    public String doTest(){
        return "Hello word";
    }
}
