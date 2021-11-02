package com.leverxcourse.homework1.ConsoleCompilation.KindsOfClasses;

import com.leverxcourse.homework1.ConsoleCompilation.Interfaces.Function;

//Class
public class SimpleClass {

    //Nested class
    private static class NestedClass{
        private double doubleValue;

        public NestedClass(double doubleValue) {
            this.doubleValue = doubleValue;
        }

        public void doSmth() {
            double res = doubleValue * 2;
        }

    }

    //Internal class
    public class InternalClass {

        public InternalClass() {

        }

        public void doSmth() {
            System.out.println("Hello");
        }
    }

    private int intField;
    private String stringField;

    public SimpleClass(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }

    public void method() {
        //Local class
        class LocalClass {
            private String string;

            public LocalClass(String string) {
                this.string = string;
            }

            public String getString() {
                return string;
            }

            public void setString(String string) {
                this.string = string;
            }
        }
        LocalClass localClass = new LocalClass("Str");

    }

    public void callWithLambda() {
        apply(argument -> argument * argument, 2);
    }

    public void callWithAnonymClass() {
            //Anonym class
        apply(new Function() {
            @Override
            public int getValue(int argument) {
                return argument * argument * argument;
            }
        }, 2);
    }

    private void apply(Function fun, int arg) {
        System.out.println(fun.getValue(arg));
    }

    public int getIntField() {
        return intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

}
