package org.example.Conditions;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int year = sc.nextInt();
        if(year%400==0){
            System.out.println(year + " is a leap year");
        } else if (year%4==0 && year%100!=0) {
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
    }
}
