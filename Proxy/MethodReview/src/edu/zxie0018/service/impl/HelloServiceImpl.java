package edu.zxie0018.service.impl;

import edu.zxie0018.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, "+ name);
    }
}
