package com.leverxcourse.homework1.ConsoleCompilation.Runner;

import com.leverxcourse.homework1.ConsoleCompilation.KindsOfClasses.SimpleClass;

public class Runner {
    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass(3, "aaa");
        simpleClass.callWithAnonymClass();
        simpleClass.callWithLambda();
    }
}
