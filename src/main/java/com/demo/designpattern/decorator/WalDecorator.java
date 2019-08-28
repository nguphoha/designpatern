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
public class WalDecorator implements IDecorateService{

    private String name;
    private String desc;

    public WalDecorator(String name) {
        this.name = name;
    }
    
    @Override
    public void decorate() {
        System.out.println(name);
    }

    @Override
    public double costCalculation() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}
