package edu.zxie0018;

import edu.zxie0018.seller.JD;
import edu.zxie0018.seller.Taobao;

public class BuyUsbMain {
    public static void main(String[] args) {
        Taobao taobao = new Taobao();
        float tb_price = taobao.sell(1);
        System.out.println("The usb price is " + tb_price + " from Taobao.");

        JD jd = new JD();
        float jd_price = jd.sell(1);
        System.out.println("The usb price is " + jd_price + " from JDong.");
    }
}
