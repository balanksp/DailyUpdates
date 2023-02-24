package com.calculator.service.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_Service {
    

    @GetMapping("add/{operation}/{a}/{b}")
    public Response add (@PathVariable String operation , @PathVariable int a , @PathVariable int b){
        return new Response("addition", a , b, a+b);
    }
 
    @GetMapping("sub/{operation}/{a}/{b}")
    public Response sub (@PathVariable String operation , @PathVariable int a , @PathVariable int b){
        return new Response("subtraction",a , b, a-b);
    }

    @GetMapping("multiply/{operation}/{a}/{b}")
    public Response multiply (@PathVariable String operation ,@PathVariable int a , @PathVariable int b){
        return new Response("multiplication",a , b, a*b);
    }
    
    @GetMapping("divide/{operation}/{a}/{b}")
    public Response divide (@PathVariable String operation ,@PathVariable int a , @PathVariable int b){
            return new Response("division",a , b, a/b);
    }


}
