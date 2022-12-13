package com.cch.onlineoffice.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class OnlineofficeWxApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineofficeWxApiApplication.class, args);
    }

}
