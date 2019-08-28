/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.designpattern.strategy.order;

/**
 *
 * @author Phong Hai Nguyen <hainp@novaon.vn>
 */
public class PaymentByBitcoin implements IStrategyPayment{

    @Override
    public void payment() {
        System.out.println("Payment by bitcoun");
    }
    
}
