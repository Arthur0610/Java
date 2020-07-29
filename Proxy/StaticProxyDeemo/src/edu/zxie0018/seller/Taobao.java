package edu.zxie0018.seller;

import edu.zxie0018.factory.KingstonFactory;
import edu.zxie0018.service.UsbManufacturer;

public class Taobao implements UsbManufacturer {
    private UsbManufacturer Kingston = new KingstonFactory();
    @Override
    public float sell(int amount) {
        float offer = Kingston.sell(amount);
        float finalPrice = offer + 20;
        return finalPrice;
    }
}
