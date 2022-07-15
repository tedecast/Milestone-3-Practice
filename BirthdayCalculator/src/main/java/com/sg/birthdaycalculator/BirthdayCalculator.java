/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.birthdaycalculator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class BirthdayCalculator {
    public static void main(String[] args) {

        System.out.println("Welcome to the Magical BirthDAY Calculator!");
        System.out.println("");
        
        // Ask someone for their birthday ex: 01/01/2002
        System.out.println("What's your birthday?(MM-dd-yyyy format)");
        Scanner userInput = new Scanner(System.in);
        String birthday = "";
        birthday = userInput.nextLine();
        
        // Formats userInput
        LocalDate ld = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        // Tell them the day of the week their birthday falls on.
        DayOfWeek dayOfWeek = ld.getDayOfWeek();
        System.out.println("That means you were born on a " + dayOfWeek + "!");
        
        // Then tell them the day of the week it falls on this year!
//      String formatted = ld.format(DateTimeFormatter.ofPattern("MM-dd-2022"));
//        DayOfWeek currentDay = DayOfWeek.from(formatted);
//
//        System.out.println(formatted);
        
        dayOfWeek = ld.getDayOfWeek();
        // currentDay = formatted.getDayOfWeek();
        System.out.println("This year it falls on a " + dayOfWeek.name() + "...");
        //System.out.println(ld);
//        
//        String formatted = ld.format(
//                DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
//        System.out.println("That's means you were born on a " + formatted);
//        System.out.println("This year it falls on a MONDAY...");
//        LocalDate n = LocalDate.now();
//        Period diff = ld.until(n);
//        System.out.println("And since today is " + ld + " , there's only " + diff.getDays() + " more days until the next one!");
//        System.out.println("Bet yer excited to be turning " + diff.getYears());
    }

        
        
    }

