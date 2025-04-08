package org.example.Arrays;

public class Array3_SecondLargest2 {

    public static void main(String[] args) {

        int[] arr = {6, 4, 7, 3, 2, 8, 7, 8};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest; // Update second largest before changing largest
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num; // Update second largest only if it's smaller than the largest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}

