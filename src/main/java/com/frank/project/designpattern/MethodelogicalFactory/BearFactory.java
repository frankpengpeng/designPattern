package com.frank.project.designpattern.MethodelogicalFactory;

import com.frank.project.designpattern.Models.AbstractModel;
import com.frank.project.designpattern.Models.Bear;

public class BearFactory extends AbstractFactory {
    @Override
    AbstractModel createBean() {
        return new Bear();
    }
}
