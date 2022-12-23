package com.demo.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.demo.kubernetes.controller")
public class KubernetesDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KubernetesDemoApplication.class, args);
    }

}
