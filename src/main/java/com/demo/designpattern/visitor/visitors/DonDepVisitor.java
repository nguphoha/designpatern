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
public class DonDepVisitor implements IKhach {

    @Override
    public void visit(Nha nha) {
        System.out.println();
        System.out.println("Dọn dẹp nhà");
        System.out.println("Lau mặt tiền nhà, quét dọn sân nhà");
    }

    @Override
    public void visit(Bep bep) {
        System.out.println();
        System.out.println("Dọn dẹp bếp");
        System.out.println("Vệ sinh tủ chén");
        System.out.println("Vệ sinh tủ lạnh");
        System.out.println("Dọn dẹp quầy mini bar");
        System.out.println("Lau sàn bếp");
    }

    @Override
    public void visit(NhaVeSinh nvs) {
        System.out.println();
        System.out.println("Dọn dẹp bếp");
        System.out.println("Vệ sinh tủ chén");
        System.out.println("Vệ sinh tủ lạnh");
        System.out.println("Dọn dẹp quầy mini bar");
        System.out.println("Lau sàn bếp");
    }

    @Override
    public void visit(Phong phong) {
        System.out.println();
        System.out.println("Dọn dẹp phòng ngủ");
        System.out.println("Dọn dẹp giường ngủ");
        System.out.println("Treo quần áo vào tủ");
        System.out.println("Lau bụi tivi, kệ, tủ trong phòng ngủ");
        System.out.println("Lau sàn phòng ngủ");
    }

    @Override
    public void visit(PhongKhach phong) {
        System.out.println();
        System.out.println("Dọn dẹp phòng khách");
        System.out.println("Quét bụi bàn, ghế, tivi, kệ sách");
        System.out.println("Hút bụi sàn nhà");
        System.out.println("Vệ sinh thảm phòng khách");
    }

}
