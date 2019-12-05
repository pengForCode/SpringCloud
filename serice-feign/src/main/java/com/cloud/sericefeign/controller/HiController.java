package com.cloud.sericefeign.controller;

import com.cloud.sericefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Yu Peng
 * @Date 2019/12/5 11:38
 * @Version 1.0
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi/{name}")
    public String sayHi(@PathVariable("name") String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}
