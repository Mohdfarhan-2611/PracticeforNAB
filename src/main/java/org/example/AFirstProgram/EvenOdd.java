package org.example.AFirstProgram;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = sc.nextInt();

        if(num1%2==0){
            System.out.println(num1+" it is even number");
        }else{
            System.out.println(num1+" it is odd number");
        }
    }
}
