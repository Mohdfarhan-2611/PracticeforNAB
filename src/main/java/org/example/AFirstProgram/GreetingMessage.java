package org.example.AFirstProgram;

import java.util.Scanner;

public class GreetingMessage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();

        System.out.println("Good Morning! "+name);



    }
}
