package edu.zxie0018;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] list =  {1, 2, 3, 4, 5, 6, 7, 8};

        int result = 0;
        for(int i = 0; i < list.length; i++) {
            result += list[i];
        }

        System.out.println(result/8);

    }
}
