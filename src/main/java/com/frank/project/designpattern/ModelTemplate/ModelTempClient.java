package com.frank.project.designpattern.ModelTemplate;

public class ModelTempClient {
    public static void main(String[] args) {
        TravelByTrain travelByTrain = new TravelByTrain();
        travelByTrain.tidyLagget();
        travelByTrain.goToStation();
        travelByTrain.goToBegin();
        travelByTrain.gotoHotel();
        travelByTrain.play();

        TravelByBus travelByBus = new TravelByBus();
        travelByBus.tidyLagget();
        travelByBus.goToStation();
        travelByBus.goToBegin();
        travelByBus.gotoHotel();
        travelByBus.play();
    }
}
