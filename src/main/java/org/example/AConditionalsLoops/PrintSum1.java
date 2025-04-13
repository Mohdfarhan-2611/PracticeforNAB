package org.example.AConditionalsLoops;

import java.util.Scanner;

public class PrintSum1 {

    public static void main(String[] args) {

        int sum = 0;

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the number");
            int number = sc.nextInt();;
            if(number==0){
                break;
            }
            else{
                sum = sum + number;
            }
        }

        System.out.println("sum "+sum);

    }
}
