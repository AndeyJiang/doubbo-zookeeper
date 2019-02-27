package com.andey.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.andey.service.ProviderService;
import org.springframework.stereotype.Component;


/**
 * Created by jiangbin on 2019/2/26.
 */
@Service(interfaceClass=ProviderService.class)
@Component
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello() {
        return "Hello!!!";
    }
}
