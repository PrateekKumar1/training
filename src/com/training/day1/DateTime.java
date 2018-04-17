package com.training.day1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
public class DateTime
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start date in dd-MM-yyyy/HH:mm:ss format :");
        String s1 = sc.next();
        System.out.println("Enter end date in dd-MM-yyyy/HH:mm:ss format :");
        String s2 = sc.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy/HH:mm:ss");
        try
        {
            Date startDate = formatter.parse(s1);
            Date endDate = formatter.parse(s2);
            long diffInMilliSec = endDate.getTime() - startDate.getTime(); //calculating difference between dates
            long seconds = (diffInMilliSec / 1000) % 60;  //seconds conversion
            long minutes = (diffInMilliSec / (1000 * 60)) % 60; //minutes conversion
            long hours = (diffInMilliSec / (1000 * 60 * 60)) % 24; //hour conversion
            long days = (diffInMilliSec / (1000 * 60 * 60 * 24)) % 365; //days
            long years =  (diffInMilliSec / (1000l * 60 * 60 * 24 * 365)); //years
            System.out.print("Difference is ---> ");
            System.out.println(years+" years, "+days+" days, "+hours+" hours, "+minutes+" minutes, "+seconds+" seconds");
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
         
        sc.close();
    }
}