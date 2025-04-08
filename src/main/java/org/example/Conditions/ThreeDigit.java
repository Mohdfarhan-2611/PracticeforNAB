package org.example.Conditions;

import java.util.Scanner;

public class ThreeDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int count= 0;
        while(num>0) {
            num = num/10;
            count++;
        }
        System.out.println("Count "+count);
        if (count==3){
            System.out.println("number is a three digit number");
        }else {
            System.out.println("number is not three digit number");
        }
    }
}
