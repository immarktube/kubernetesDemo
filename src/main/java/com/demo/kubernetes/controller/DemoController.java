package com.demo.kubernetes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p> 主要用于包括XXXX</p>
 *
 * @Author <a href="mailto:immarktube@gmail.com">Marktube</a>
 * @Since 2022/12/9 17:38
 **/
@RequestMapping("/kubernetesDemo")
@RestController
public class DemoController {

    @RequestMapping("/get")
    public String getDemo(){
        System.out.println("Hello K8s");
        return "Hello K8s!!!";
    }
}
