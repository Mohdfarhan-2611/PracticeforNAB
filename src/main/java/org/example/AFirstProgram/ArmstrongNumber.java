package org.example.AFirstProgram;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int temp = number;
        int originalNumber = number;
        int totalSum = 0;
        int digit = 0;

        while (temp>0){
            temp = temp/10;
            digit++;
        }

        temp = number;

        while (temp>0)
        {
            int sum = 1;
            int remainder = temp%10;
            for(int i=1; i<=digit; i++){
                sum = sum * remainder;
            }
            totalSum = totalSum + sum;
            temp = temp/10;
        }


        if(originalNumber==totalSum){
            System.out.println("it is armstrong number");
        }else{
            System.out.println("it is not armstrong number");
        }
    }
}
