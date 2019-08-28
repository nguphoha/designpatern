/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.designpattern.visitor;

/**
 * Visitor
 * @author Phong Hai Nguyen <hainp@novaon.vn>
 */
public interface IKhach {
    void visit(Nha nha);
    void visit(Bep bep);
    void visit(NhaVeSinh nvs);
    void visit(Phong phong);
    void visit(PhongKhach phong);
}
