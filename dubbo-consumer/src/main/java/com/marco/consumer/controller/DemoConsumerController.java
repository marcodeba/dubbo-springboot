package com.marco.consumer.controller;

import com.marco.api.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {
    //相当于<dubbo:reference/>
    @Reference(loadbalance = "random", cluster = "failfast",
            mock = "com.marco.consumer.mock.SayHelloServiceMock",
            timeout = 1)
    private DemoService demoService;

    @GetMapping(value = "/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return demoService.sayHello(name);
    }
}
