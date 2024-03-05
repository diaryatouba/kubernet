package com.groupeisi.kubernet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernetApplication {

    @GetMapping("/hello")
    public String helloAll(){
        return "Welcom";
    }


    public static void main(String[] args) {
        SpringApplication.run(KubernetApplication.class, args);
    }

}
