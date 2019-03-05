package com.frank.project.designpattern.adaptor;

public class AdaptorClient {
    public static void main(String[] args) {
        Cooker cooker = new CookAdaptor();
        cooker.makeCake();
        cooker.makeSoup();
        ((CookAdaptor) cooker).show();
    }
}
