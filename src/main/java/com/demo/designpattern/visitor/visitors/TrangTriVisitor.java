/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.designpattern.visitor.visitors;

import com.demo.designpattern.visitor.Bep;
import com.demo.designpattern.visitor.IKhach;
import com.demo.designpattern.visitor.Nha;
import com.demo.designpattern.visitor.NhaVeSinh;
import com.demo.designpattern.visitor.Phong;
import com.demo.designpattern.visitor.PhongKhach;

/**
 *
 * @author Phong Hai Nguyen <hainp@novaon.vn>
 */
public class TrangTriVisitor implements IKhach {

    @Override
    public void visit(Nha nha) {
        System.out.println();
        System.out.println("Trang trí nhà");
        System.out.println("Treo chuông vàng, dán decal ông già Noel cưỡi xe tuần lộc trước cửa");
    }

    @Override
    public void visit(Bep bep) {
        System.out.println();
        System.out.println("Trang trí bếp");
        System.out.println("Treo dây kim tuyến dọc lối đi");
        System.out.println("Bày trí bàn ăn với dĩa, muỗng có hình Noel");
        System.out.println("Chuẩn bị 10 nón noel trên bàn ăn");
    }

    @Override
    public void visit(NhaVeSinh nvs) {
        System.out.println();
        System.out.println("Trang trí nhà vệ sinh");
        System.out.println("Treo chuông vàng ở cửa toilet");
    }

    @Override
    public void visit(Phong phong) {
        System.out.println("");
        System.out.println("Don dep phong");
    }

    @Override
    public void visit(PhongKhach phong) {
        System.out.println();
        System.out.println("Trang trí phòng khách");
        System.out.println("Treo băng rôn kim tuyến cùng với các hình ảnh liên quan đến giáng sinh như:cỗ xe tuần lộc, kẹo gậy, tất, v.v... ");
        System.out.println("Trang trí cây thông với các quả cầu lấp lánh (nhiều màu, nhiều kích cỡ)");
        System.out.println("Bố trí các hộp quà xung quanh cây thông");
    }

}
