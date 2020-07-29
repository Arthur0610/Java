package edu.zxie0018.test;

import edu.zxie0018.service.HelloService;
import edu.zxie0018.service.impl.HelloServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        HelloService helloService = new HelloServiceImpl();
//        helloService.sayHello("kk");
        //使用反射机制执行sayHello方法
        HelloService target = new HelloServiceImpl();
        //获取sayHello名称对应的Method方法
        Method method = HelloService.class.getMethod("sayHello", String.class);
        //通过Method可以执行sayHello方法的调用
        /*
            invoke是method类中的一个方法
            args有两个：
                1. Object obj 表示 要执行这个对象的方法
                2. Object args  方法执行时的参数值
         */
        //表达的意思就是 执行target对象sayHello 参数是 kkk
        Object ret = method.invoke(target, "kkk");

    }
}
