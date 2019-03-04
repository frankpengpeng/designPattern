package com.frank.project.designpattern.Strategy;

public class StrategySelector {
    AbsStrategy strategy;

    public void setStrategy(String type){
        switch (type){
            case "spring":
                strategy = new StrategyForSpringFestival();
                break;
            case "mid-autumn":
                strategy = new StrategyForMidAutumn();
                break;
            case "labor-day":
                strategy = new StrategyForLaborDay();
        }
    }

    public void exeStrategy(){
        strategy.show();
    }
}
