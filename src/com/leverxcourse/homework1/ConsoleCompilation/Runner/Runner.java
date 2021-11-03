package com.leverxcourse.homework1.ConsoleCompilation.Runner;

import com.leverxcourse.homework1.ConsoleCompilation.Interfaces.Function;
import com.leverxcourse.homework1.ConsoleCompilation.KindsOfClasses.SimpleClass;

import java.io.FileReader;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;
import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {/*
        SimpleClass simpleClass = new SimpleClass(3, "aaa");
        simpleClass.callWithAnonymClass();
        simpleClass.callWithLambda();*/

        int[] arr = new int[1];
        arr[0] = 2;
        arr[0] = 10;
        Function foo = arg -> arg * arr[0];

        System.out.println(foo.getValue(1));
        try {
            System.exit(0);
        } finally {
            System.out.println("sdd");
        }
    }
}
