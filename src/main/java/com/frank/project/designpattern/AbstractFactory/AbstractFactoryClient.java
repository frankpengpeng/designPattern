package com.frank.project.designpattern.AbstractFactory;

import com.frank.project.designpattern.Models.AbstractModel;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        AbstractFoodFactory packageA = new PackageFactoryA();
        AbstractModel colo = packageA.drinkFactory();
        AbstractModel hanbao = packageA.foodFactory();
        System.out.println("————————套餐A-----------------");
        colo.show();
        hanbao.show();
        AbstractFoodFactory packageb = new PackageFactoryB();
        AbstractModel bear = packageb.drinkFactory();
        AbstractModel drychicken = packageb.foodFactory();
        System.out.println("————————套餐B-----------------");
        bear.show();
        drychicken.show();
    }
}
