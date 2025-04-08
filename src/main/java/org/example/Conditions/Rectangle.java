package org.example.Conditions;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int breadth = sc.nextInt();

        int area = length * breadth;
        int parameter = 2* (length + breadth);

        System.out.println("Area "+area);
        System.out.println("Parameter "+parameter);

        if(area>parameter){
            System.out.println("area of rectangle is greater than parameter");
        }else{
            System.out.println("area of rectangle is less than parameter");
        }


    }
}
