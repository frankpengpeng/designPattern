package com.frank.project.designpattern.Proxy;

public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("购买MAC");
    }
}
