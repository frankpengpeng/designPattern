package com.frank.project.designpattern.ModelTemplate;

public abstract class Travel {
    public void tidyLagget() {
        System.out.println("收拾行李");
    }

    public abstract void goToStation();
    public abstract  void goToBegin();

    public void gotoHotel(){
        System.out.println("去旅馆");
    }

    public void play() {
        System.out.println("去玩耍");
    }
}
