/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.birthdaycalculator;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class BirthdayCalculator {
    public static void main(String[] args) {
        
        String birthday = "";
        
        System.out.println("Welcome to the Magical BirthDAY Calculator!");
        
        // Ask someone for their birthday ex: 01/01/2002
        System.out.println("What's your birthday? (mm-dd-yyyy format)");
        Scanner userInput = new Scanner(System.in);
        birthday = userInput.nextLine();
        // converting format of date
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toString());
        
        
        // Tell them the day of the week their birthday falls on.
        
        
        
    }
}
