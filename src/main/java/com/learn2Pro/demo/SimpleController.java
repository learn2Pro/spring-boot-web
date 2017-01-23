package com.learn2Pro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: tang
 * Date: 2017/1/20
 * Time: 17:51
 * To change this template use File | Settings | File Templates.
 */
@Controller
@EnableAutoConfiguration
public class SimpleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!!@@!!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SimpleController.class, args);
    }
}
