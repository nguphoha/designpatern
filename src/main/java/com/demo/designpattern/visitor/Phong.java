/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.designpattern.visitor;

/**
 *
 * @author Phong Hai Nguyen <hainp@novaon.vn>
 */
public class Phong implements IKhongGian{

    @Override
    public void accept(IKhach khach) {
        khach.visit(this);
    }
    
}
