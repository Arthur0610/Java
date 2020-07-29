package edu.zxie0018.handler;

import edu.zxie0018.service.UsbManufacturer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MySellerHandler implements InvocationHandler {
    private Object target = null;

    public MySellerHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        res = method.invoke(target, args);

        if(res != null) {
            Float price = (Float) res;
            price = price + 25;
            res = price;
        }

        return res;
    }
}
