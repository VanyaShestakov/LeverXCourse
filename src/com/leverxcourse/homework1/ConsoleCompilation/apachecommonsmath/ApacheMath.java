package com.leverxcourse.homework1.ConsoleCompilation.apachecommonsmath;


import org.apache.commons.math3.util.Decimal64;
import org.apache.commons.math3.util.MathUtils;

public class ApacheMath {

    public static void main(String[] args) {
        Decimal64 el1 = new Decimal64(12);
        Decimal64 el2 = new Decimal64(15);
        System.out.println(MathUtils.max(el1, el2));
    }

}
