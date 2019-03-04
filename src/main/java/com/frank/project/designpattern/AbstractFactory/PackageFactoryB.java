package com.frank.project.designpattern.AbstractFactory;

import com.frank.project.designpattern.Models.AbstractModel;
import com.frank.project.designpattern.Models.Bear;
import com.frank.project.designpattern.Models.DryChicken;

public class PackageFactoryB extends AbstractFoodFactory {
    @Override
    AbstractModel foodFactory() {
        return new DryChicken();
    }

    @Override
    AbstractModel drinkFactory() {
        return new Bear();
    }
}
