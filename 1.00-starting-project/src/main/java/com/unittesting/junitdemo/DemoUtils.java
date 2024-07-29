package com.unittesting.junitdemo;

public class DemoUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public Object checkNull(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
