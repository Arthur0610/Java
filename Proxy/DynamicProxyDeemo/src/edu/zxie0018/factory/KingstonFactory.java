package edu.zxie0018.factory;

import edu.zxie0018.service.UsbManufacturer;

public class KingstonFactory implements UsbManufacturer {
    @Override
    public float sell(int amount) {
        return 85.0f;
    }
}
