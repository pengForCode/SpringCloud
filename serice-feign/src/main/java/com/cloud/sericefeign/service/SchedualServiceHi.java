package com.cloud.sericefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author Yu Peng
 * @Date 2019/12/5 11:36
 * @Version 1.0
 */
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi/{name}",method = RequestMethod.GET)
    String sayHiFromClientOne(@PathVariable("name") String name);
}
