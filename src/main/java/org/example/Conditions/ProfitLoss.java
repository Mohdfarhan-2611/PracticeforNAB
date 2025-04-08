package org.example.Conditions;

import java.util.Scanner;

public class ProfitLoss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price");
        int costPrice = sc.nextInt();
        System.out.println("Enter the Selling Price");
        int sellingPrice = sc.nextInt();

        if(sellingPrice>costPrice){
            int profit = sellingPrice-costPrice;
            System.out.println("Profit made by seller is "+profit);
        }
        else {
            int Loss = costPrice-sellingPrice;
            System.out.println("Loss made by seller is "+Loss);
        }

    }
}
