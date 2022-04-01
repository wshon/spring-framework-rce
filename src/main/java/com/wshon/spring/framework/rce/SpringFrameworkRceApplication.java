package com.wshon.spring.framework.rce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringFrameworkRceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFrameworkRceApplication.class, args);
    }

    @RequestMapping({"/"})
    public String index(User user) {
        return "ok";
    }

}
