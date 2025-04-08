package org.example.AFirstProgram;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = sc.next();

        StringBuilder  sb = new StringBuilder(name);
        String reverse = sb.reverse().toString();

        if(name.equals(reverse)){
            System.out.println(name+" it is palindrome string");
        }else{
            System.out.println(name+" It is not a palindrome string");
        }





        
    }
}
