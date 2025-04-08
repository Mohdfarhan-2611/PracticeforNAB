package org.example.AFlowofProgram6;

import java.util.Scanner;

public class Hcf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number Year");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        int hcf  =0;

        while(num2!=0){
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }

        hcf = num1;

        System.out.println("HCF is "+hcf);
    }
}
