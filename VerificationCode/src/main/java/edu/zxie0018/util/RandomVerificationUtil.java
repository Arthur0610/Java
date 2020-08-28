package edu.zxie0018.util;

import java.util.Random;

public class RandomVerificationUtil {
    private char[] verList = new char[24];
    private char[] numList = new char[10];

    public RandomVerificationUtil() {
        init();
    }

    private void init() {
        char alpha  = 'A';
        char zero = '0';
        for(int i = 0; i < 24; i++) {
            verList[i] = alpha;
            alpha++;
        }

        for(int j = 0; j < 10; j++) {
            numList[j] = zero;
            zero++;
        }
    }

    public String randomVerificationCode(int index) {
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < index; i++) {
            if(isNumber()){
                sb.append(randomNum());
            } else {
                sb.append(randomVer());
            }
        }

        return sb.toString();
    }

    public char randomVer() {
        return verList[new Random().nextInt(verList.length)];
    }

    public char randomNum() {
        return numList[new Random().nextInt(numList.length)];
    }

    public boolean isNumber() {
        return Math.random() < 0.5;
    }
}
