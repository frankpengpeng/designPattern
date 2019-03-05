package com.frank.project.designpattern.Proxy;

public class ProxyClient {
    public static void main(String[] args) {
        Subject proxy = new SubjectProxy();
        proxy.buyMac();
    }
}
