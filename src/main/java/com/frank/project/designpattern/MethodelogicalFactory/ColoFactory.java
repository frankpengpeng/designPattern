package com.frank.project.designpattern.MethodelogicalFactory;

import com.frank.project.designpattern.Models.AbstractModel;
import com.frank.project.designpattern.Models.Coco;

public class ColoFactory extends AbstractFactory {
    @Override
    AbstractModel createBean() {
        return new Coco();
    }
}
