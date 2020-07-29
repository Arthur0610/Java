package edu.zxie0018.seller;

import edu.zxie0018.factory.KingstonFactory;
import edu.zxie0018.service.UsbManufacturer;

public class JD implements UsbManufacturer {
    private UsbManufacturer JDong = new KingstonFactory();
    @Override
    public float sell(int amount) {
        float offer = JDong.sell(amount);
        float finalPrice = offer + 30;

        return finalPrice;

    }
}
