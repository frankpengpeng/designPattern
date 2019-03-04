package com.frank.project.designpattern.SimpleFactory;

import com.frank.project.designpattern.Models.AbstractModel;
import com.frank.project.designpattern.Models.Bear;
import com.frank.project.designpattern.Models.Coco;

public class SimpleDrinkFactory {
    public static AbstractModel createProduct(String type){
        switch (type){
            case "bear":
                return new Bear();
            case "colo":
                return new Coco();
        }
        return null;
    }
}
