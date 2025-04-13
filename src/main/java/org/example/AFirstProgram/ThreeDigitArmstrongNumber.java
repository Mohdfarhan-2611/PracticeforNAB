package org.example.AFirstProgram;

public class ThreeDigitArmstrongNumber {

    public static void main(String[] args) {

        int digit = 3;

        for (int i = 100; i <= 999; i++) {
            int totalSum = 0;  // <-- Move here
            int temp = i;
            while (temp > 0) {
                int sum = 1;
                int remainder = temp % 10;
                for (int j = 1; j <= digit ; j++) {
                    sum = sum * remainder;
                }
                totalSum = totalSum + sum;
                temp = temp / 10;
            }
            if (totalSum == i) {
                System.out.println(i);
            }
        }

    }
}
