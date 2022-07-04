/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.enumspractice.bigdecimalcodealong;

import java.math.BigDecimal;

/**
 *
 * @author Teresa
 */
public class App {
    public static void main(String[] args) {
        BigDecimalMath myMath = new BigDecimalMath();
        
        BigDecimal op1 = new BigDecimal("10");
        // changing from 3, to 6, which rounds up from 1.666 = 1.67
        // use BigDecimal for counting money
        BigDecimal op2 = new BigDecimal("6");
        
        System.out.println(myMath.calculate(MathOperator.PLUS, op1, op2));
        System.out.println(myMath.calculate(MathOperator.MINUS, op1, op2));
        System.out.println(myMath.calculate(MathOperator.MULTIPLY, op1, op2));
        System.out.println(myMath.calculate(MathOperator.DIVIDE, op1, op2));
        
    }
}
