package com.frank.project.designpattern.ModelTemplate;

public class TravelByBus extends Travel {
    @Override
    public void goToStation() {
        System.out.println("去汽车站");
    }

    @Override
    public void goToBegin() {
        System.out.println("做汽车去北京");
    }
}
