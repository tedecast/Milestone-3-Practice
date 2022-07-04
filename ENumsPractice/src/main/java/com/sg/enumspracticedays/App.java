/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.enumspracticedays;

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
        String dayStr = userInput.nextLine();
        // convert String to enum - WeekDays
        WeekDays day = WeekDays.valueOf(dayStr.toUpperCase()); 
        
        // then use a switch statement and your enum to print out 
//        DaysOfTheWeek[] dayOfWeek = DaysOfTheWeek.values();
//        for(DaysOfTheWeek today : dayOfWeek){
            // how many days there are until Friday
            // Using Enum in Switch case statement
            switch(day){
                case SATURDAY:
                    System.out.println("There are 6 days until Friday!");
                    break;
                case SUNDAY:
                    System.out.println("There are 5 days until Friday!");
                    break;
                case MONDAY:
                    System.out.println("There are 4 days until Friday!");
                    break;
                case TUESDAY:
                    System.out.println("There are 3 days until Friday!");
                    break;
                case WEDNESDAY:
                    System.out.println("There are 2 days until Friday!");
                    break;
                case THURSDAY:
                    System.out.println("There is 1 more day until Friday!");
                    break;
                case FRIDAY:
                    System.out.println("0 DAYS! Today is Friday!");
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
//            if(day.equals("FRIDAY")){
//                System.out.println("Well, since you said it's Friday, there are zero days until Friday!");
//            } else {
//                System.out.println("There are " + day + " days until friday!");
//            }
    }
}
    
    

