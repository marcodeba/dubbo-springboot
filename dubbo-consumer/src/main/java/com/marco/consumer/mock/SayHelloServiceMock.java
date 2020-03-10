package com.marco.consumer.mock;

import com.marco.api.service.DemoService;

public class SayHelloServiceMock implements DemoService {

    @Override
    public String sayHello(String name) {
        return "fuck your mother!!!";
    }
}
