package com.cloud.serviceribbon.controller;

import com.cloud.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Yu Peng
 * @Date 2019/12/4 15:16
 * @Version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping("/hi/{name}")
    public String hi(@PathVariable("name") String name) {
        return helloService.hiService(name);
    }

}
