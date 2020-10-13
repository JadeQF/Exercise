package com.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 林 v.linxh@gmail.com
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "潘崎帆";
    }


}
