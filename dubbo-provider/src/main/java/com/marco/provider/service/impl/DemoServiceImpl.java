package com.marco.provider.service.impl;

import com.marco.api.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

@Service(cluster = "failsafe", loadbalance = "random")//相当于<dubbo-service />
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello, " + name + " (from Spring Boot)";
    }
}
