/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.enumspractice2;

import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class App {
    public static void main(String[] args) {
        // asks the user to enter a day of the week
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter a day of the week.");
        String day = userInput.nextLine();
        
        // then use a switch statement and your enum to print out 
        DaysOfTheWeek[] dayOfWeek = DaysOfTheWeek.values();
        for(DaysOfTheWeek today : dayOfWeek){
            // how many days there are until Friday
            // Using Enum in Switch case statement
            switch(today){
                case SUNDAY:
                    System.out.println("Sunday is FUNday!");
                    break;
                case MONDAY:
                    System.out.println("Mondays suck.");
                    break;
                case TUESDAY:
                    System.out.println("Tooney Tuesday!");
                    break;
                case WEDNESDAY:
                    System.out.println("Wednesdays we wear pink.");
                    break;
                case THURSDAY:
                    System.out.println("Thurs-ty-day");
                    break;
                case FRIDAY:
                    System.out.println("Fri-YAYYA!");
                    break;
                case SATURDAY:
                    System.out.println("Satur-heeeey");
                    break;
            }
            
        }
    }
     
}
