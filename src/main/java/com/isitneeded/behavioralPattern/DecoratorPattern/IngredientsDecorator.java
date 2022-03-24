/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.DecoratorPattern;

/*
* Decorator which is type of Beverage (inheritence) and has a Beverage (composition)
*
* */

public abstract class IngredientsDecorator extends Beverage{

    /*
    * This is the beverage which going to be decorated by each IngredientsDecorator.
    *
    * Here Supertype (Beverage) is used, so that any type of Decorator can wrap the beverage.
    * */
    Beverage beverage;


    public abstract String getDescription();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
