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
public interface IDecorateService {
    
    public void decorate();
    
    /**
     * tính toán chi phí
     */
    public double costCalculation();
}
