package com.frank.project.designpattern.SimpleFactory;

import com.frank.project.designpattern.Models.AbstractModel;

public class ClientUseSimpleFactory {
    public static void main(String[] args) {
        AbstractModel bear = SimpleDrinkFactory.createProduct("bear");
        bear.show();
        AbstractModel colo = SimpleDrinkFactory.createProduct("colo");
        colo.show();
    }
}
