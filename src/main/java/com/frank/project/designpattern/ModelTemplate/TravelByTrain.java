package com.frank.project.designpattern.ModelTemplate;

public class TravelByTrain extends Travel {
    @Override
    public void goToStation() {
        System.out.println("去火车站");
    }

    @Override
    public void goToBegin() {
        System.out.println("坐火车去北京");
    }
}
