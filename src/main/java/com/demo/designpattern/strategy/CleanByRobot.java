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
public class CleanByRobot implements IStrategyClean{

    @Override
    public void cleanCeilling() {
        System.out.println("Lau tran bang robot");
    }

    @Override
    public void cleanTable() {
        System.out.println("Lau ban bang robot");
    }

    @Override
    public void scanFloor() {
        System.out.println("Quet san bang robot");
    }

    @Override
    public void cleanFloor() {
        System.out.println("Lau san bang robot");
    }
    
}
