package com.frank.project.designpattern.AbstractFactory;

import com.frank.project.designpattern.Models.AbstractModel;
import com.frank.project.designpattern.Models.Coco;
import com.frank.project.designpattern.Models.Hanbao;

public class PackageFactoryA extends AbstractFoodFactory {
    @Override
    AbstractModel foodFactory() {
        return new Hanbao();
    }

    @Override
    AbstractModel drinkFactory() {
        return new Coco();
    }
}
