/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.datetimecodealong;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Teresa
 */
public class App {
    public static void main(String[] args) {
        // gets date for now
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        
        // prints out date
        ld = LocalDate.parse("2015-01-01");
        System.out.println(ld);
        
        // puts in format
        ld = LocalDate.parse("02/07/2010", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(ld);
        
        String isoDate = ld.toString();
        System.out.println(isoDate);
        // another way below
        ld = LocalDate.parse(isoDate);
        System.out.println(ld);
        
        // reads it this way
        String formatted = ld.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(formatted);
        
        // can write in any way
        formatted = ld.format(DateTimeFormatter.ofPattern("MM=dd=====yyyy"));
        System.out.println(formatted);
        
        // format styling, multiple choices
        formatted = ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(formatted);
        
        // subtracting days
        LocalDate past = ld.minusDays(8);
        formatted = past.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(formatted);
        
        // subtracting months
        past = ld.minusMonths(3);
        formatted = past.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(formatted);
        
        // how much time has gone past between 2 dates
        // can do it for hours, minutes, seconds, etc.
        Period diff = ld.until(past);
        System.out.println(diff);
        System.out.println(diff.getMonths());
        diff = past.until(ld);
        System.out.println(diff.getMonths());
        
        // gets everything of iso pattern
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        // changes pattern, removes milliseconds (lower case for minutes)
        formatted = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
        System.out.println(formatted);
        
        // Legacy API
        Date legacyDate = new Date();
        System.out.println(legacyDate);
        
        // gets everything, more for debugging
        GregorianCalendar legacyCalender = new GregorianCalendar();
        System.out.println(legacyCalender);
        
        // zoned conversions
        ZonedDateTime zdt = ZonedDateTime.ofInstant(legacyDate.toInstant(), ZoneId.systemDefault());
        ld = zdt.toLocalDate();
        System.out.println(ld);
        
        // gregorian, more conversions. 
        zdt = legacyCalender.toZonedDateTime();
        ld = zdt.toLocalDate();
        System.out.println(ld);
    }
}
