/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.designpattern.strategy;

/**
 *
 * @author Phong Hai Nguyen <hainp@novaon.vn>
 */
public class CleanService {
    protected IStrategyClean strategyClean;

    public CleanService(IStrategyClean strategyClean) {
        this.strategyClean = strategyClean;
    }
    
    public void clean(){
        strategyClean.cleanCeilling();
        strategyClean.cleanTable();
        strategyClean.scanFloor();
        strategyClean.cleanFloor();
    }
}
