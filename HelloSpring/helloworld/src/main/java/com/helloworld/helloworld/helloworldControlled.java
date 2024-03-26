package com.helloworld.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloworldControlled {

    @GetMapping("/")
    @ResponseBody
    public String requestMethodName() {
        return "Helloworld";
    }
    
}
