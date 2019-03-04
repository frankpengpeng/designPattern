package com.frank.project.designpattern.MethodelogicalFactory;

import com.frank.project.designpattern.Models.AbstractModel;

public class MethFactoryClient {
    public static void main(String[] args) {
        AbstractFactory bearFactory = new BearFactory();
        AbstractModel bear = bearFactory.createBean();
        bear.show();
        AbstractFactory coloFactory = new ColoFactory();
        AbstractModel colo = coloFactory.createBean();
        colo.show();
    }
}
