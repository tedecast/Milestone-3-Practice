/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.enumspractice;

import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please to enter a number.");
        int operand1 = Integer.parseInt(userInput.nextLine());
        
        System.out.println("Please enter another number");
        int operand2 = Integer.parseInt(userInput.nextLine());
        
        System.out.println("Please choose whether you want these numbers to plus, minus, multiply or divide.");
        String mathStr = userInput.nextLine();
        MathOperator math = MathOperator.valueOf(mathStr.toUpperCase());
        
        int sum = 0;
        switch(math){
            case PLUS:
                sum = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + sum);
        }
    }
}
