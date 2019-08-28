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
public class PaintMatit extends DecoratorBase{

    public PaintMatit(IDecorateService decorator) {
        super(decorator);
    }

    @Override
    public double costCalculation() {
        return super.getDecorator().costCalculation() + 4; 
    }

    @Override
    public void decorate() {
        decorator.decorate();
        System.out.println("Sơn lớp bar matit");
    }
    
    
}
