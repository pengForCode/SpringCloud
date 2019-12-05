package com.cloud.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Yu Peng
 * @Date 2019/12/4 15:15
 * @Version 1.0
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi/"+name,String.class);
    }
}
