package com.leige.utils;

import java.math.BigDecimal;

public class Tset00 {
    public static void main(String[] args) {
//        long a = 9999999999999;
       long b = 999999999999999999l;
       float aa = 9.11f;
       double a = aa;

//         输出a   9.11111068725586
       double c = 9.11111111111;
//       输出b     9.11111111111111

        System.out.println(a);
        System.out.println(c);
        BigDecimal b1 = new BigDecimal(Double.toString(2.00));
        BigDecimal b2 = new BigDecimal(Double.toString(1.10));

        char aaaa = '\'';
        System.out.println(aaaa);
        System.out.println(b1.add(b2).doubleValue());
        char l='a'+10;
        char ll='a'+10;
        double lll=l+10;
    }
}
