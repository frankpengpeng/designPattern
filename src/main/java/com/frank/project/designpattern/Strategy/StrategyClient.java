package com.frank.project.designpattern.Strategy;

public class StrategyClient {
    public static void main(String[] args) {
        StrategySelector selector = new StrategySelector();
        selector.setStrategy("spring");
        selector.exeStrategy();

        selector.setStrategy("mid-autumn");
        selector.exeStrategy();

        selector.setStrategy("labor-day");
        selector.exeStrategy();

    }

}
