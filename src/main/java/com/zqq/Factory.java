package com.zqq;

public class Factory {
    public static Object getInstance(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Object o = Class.forName(name).newInstance();
        return o;
    }
}
