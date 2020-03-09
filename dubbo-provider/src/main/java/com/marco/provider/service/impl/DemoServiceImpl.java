package com.marco.provider.service.impl;

import com.marco.api.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

@Service//(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }
}
