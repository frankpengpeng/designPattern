package com.frank.project.designpattern.AbstractFactory;

import com.frank.project.designpattern.Models.AbstractModel;

public abstract class AbstractFoodFactory {
    abstract AbstractModel foodFactory();
    abstract AbstractModel drinkFactory();
}
