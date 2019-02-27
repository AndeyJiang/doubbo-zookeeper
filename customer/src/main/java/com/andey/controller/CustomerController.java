package com.andey.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.andey.service.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangbin on 2019/2/26.
 */
@RestController
@RequestMapping("/db")
public class CustomerController {

    @Reference
    private ProviderService providerService;

    @GetMapping("/test")
    public  String sayHello(){
        return providerService.sayHello();
    }
}
