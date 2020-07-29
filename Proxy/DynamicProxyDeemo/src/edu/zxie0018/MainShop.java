package edu.zxie0018;

import edu.zxie0018.factory.KingstonFactory;
import edu.zxie0018.handler.MySellerHandler;
import edu.zxie0018.service.UsbManufacturer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args) {
        UsbManufacturer kingston = new KingstonFactory();
        InvocationHandler invocationHandler = new MySellerHandler(kingston);

        UsbManufacturer proxy = (UsbManufacturer) Proxy.newProxyInstance(kingston.getClass().getClassLoader(),
                kingston.getClass().getInterfaces(),
                invocationHandler);

        float price = proxy.sell(1);

        System.out.println("The usb price is " + price + " from proxy.");
    }
}
