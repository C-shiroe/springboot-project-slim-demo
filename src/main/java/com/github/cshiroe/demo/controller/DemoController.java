package com.github.cshiroe.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo接口
 *
 * @author C-shiroe
 * @date 2021/3/30 9:13
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test/{name}")
    public String helloWorld(@PathVariable("name") String name) {
        String s = "Hello World, " + name + "!";
        System.out.println(s);
        return s;
    }

}
