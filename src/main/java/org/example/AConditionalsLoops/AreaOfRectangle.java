package org.example.AConditionalsLoops;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the bredth");
        int breadth = sc.nextInt();

        int Area = length * breadth;

        System.out.println(Area);
    }
}
