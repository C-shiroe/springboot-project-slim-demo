package com.github.cshiroe.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.github.cshiroe.**"})
public class SpringbootProjectSlimDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProjectSlimDemoApplication.class, args);
    }

}
