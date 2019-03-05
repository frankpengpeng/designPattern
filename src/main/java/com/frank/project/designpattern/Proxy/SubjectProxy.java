package com.frank.project.designpattern.Proxy;

public class SubjectProxy implements Subject {
    @Override
    public void buyMac() {
        RealSubject subject = new RealSubject();
        System.out.println("我是代购");
        subject.buyMac();
        System.out.println("代购完成");
    }
}
