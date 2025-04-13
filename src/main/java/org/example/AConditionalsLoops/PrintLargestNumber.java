package org.example.AConditionalsLoops;

import java.util.Scanner;

public class PrintLargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int largest = 1;

        while(true) {
            System.out.println("Enter the number");
            int number = sc.nextInt();
            if(number==0){
                break;
            } else if (largest<number) {
                largest=number;
            }
        }

        System.out.println("Largest "+largest);
    }
}
