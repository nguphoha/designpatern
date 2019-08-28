/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.designpattern;

import com.demo.designpattern.decorator.IDecorateService;
import com.demo.designpattern.decorator.PaintGreenColor;
import com.demo.designpattern.decorator.PaintMatit;
import com.demo.designpattern.decorator.PaintWaterproofing;
import com.demo.designpattern.decorator.WalDecorator;
import com.demo.designpattern.strategy.CleanByHuman;
import com.demo.designpattern.strategy.CleanByRobot;
import com.demo.designpattern.strategy.CleanService;
import com.demo.designpattern.strategy.IStrategyClean;
import com.demo.designpattern.visitor.IKhach;
import com.demo.designpattern.visitor.Nha;
import com.demo.designpattern.visitor.visitors.DonDepVisitor;
import com.demo.designpattern.visitor.visitors.TrangTriVisitor;

/**
 *
 * @author Phong Hai Nguyen <hainp@novaon.vn>
 */
public class DesignPattern {
    
    public static void main(String[] args) {
        demoVisitor();
//        demoStrategy();
//        demoDecorator();
    }
    
    private static void demoStrategy(){
        IStrategyClean robot = new CleanByRobot();
        IStrategyClean human = new CleanByHuman();
        CleanService cleanService = new CleanService(human);
        System.out.println("Don dep thu cong");
        cleanService.clean();
        System.out.println("-------------------------");
        cleanService = new CleanService(robot);
        System.out.println("Don dep bang robot");
        cleanService.clean();
        System.out.println("Xong");
    }
    
    private static void demoDecorator() {
        //trang trí cơ bản
        IDecorateService decorateService = new WalDecorator("Tường nhà tôi");

        //thêm các option
        decorateService = new PaintMatit(//sơn bả matit
                new PaintWaterproofing(//thêm option sơn chống thấm
                        new PaintGreenColor(decorateService)
                )
        );
        
        System.out.println("Bắt đầu trang trí");
        decorateService.decorate();
        System.out.println("Tổng tiền là: " + decorateService.costCalculation());
        System.out.println("Xong");
    }
    
    private static void demoVisitor(){
        Nha nha = new Nha();
        System.out.println("Đội dọn dẹp đến");
        IKhach visitor = new DonDepVisitor();
        nha.accept(visitor);
        System.out.println("Đội trang trí đến");
        visitor = new TrangTriVisitor();
        nha.accept(visitor);
        System.out.println("Xong");
    }
}
