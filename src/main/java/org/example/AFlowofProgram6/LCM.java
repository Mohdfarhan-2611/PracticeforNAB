package org.example.AFlowofProgram6;

import java.util.Scanner;

public class LCM {

    public static int Hcf(int num1, int num2){
        int hcf = 0;
        while (num2!=0){
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
         hcf = num1;

        return hcf;
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number Year");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        int lcm = num1 * num2 / Hcf(num1, num2);
        System.out.println("Lcm is "+lcm);


    }
}
