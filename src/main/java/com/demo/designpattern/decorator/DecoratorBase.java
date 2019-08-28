/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.designpattern.decorator;

/**
 *
 * @author Phong Hai Nguyen <hainp@novaon.vn>
 */
public class DecoratorBase implements IDecorateService{

    //read only
    protected IDecorateService decorator;
    
//    public DecoratorBase() {
//    }

    public DecoratorBase(IDecorateService decorator) {
        this.decorator = decorator;
    }
    
    

    @Override
    public void decorate() {
    }

    @Override
    public double costCalculation() {
        return 1;
    }

    public IDecorateService getDecorator() {
        return decorator;
    }
    
    
}
