package edu.zxie0018.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ConvertImageUtil {

    public ConvertImageUtil() {}

    public void convertToImage(String verificationCode) {
        BufferedImage bi = new BufferedImage(100,50, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = bi.createGraphics();

        graphics.fillRect(0, 0, 100, 50);

        graphics.setColor(Color.RED);
        graphics.setFont(new Font("New Time Ramon", Font.ITALIC, 20));

        char[] vcList = verificationCode.toCharArray();
        for(int i = 0; i < vcList.length; i++) {
            graphics.drawString(vcList[i]+"", i * 12, 30);
        }

        try{
            OutputStream os = new FileOutputStream(new File("VerificationCode.png"));
            ImageIO.write(bi, "png", os);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
