package org.example.Conditions;

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if(a<0){
            a= a * -1;
            System.out.println(a);
        }
        else {
            System.out.println(a);
        }
    }
}
