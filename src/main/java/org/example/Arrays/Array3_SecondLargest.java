package org.example.Arrays;

import java.util.*;

import static java.lang.reflect.Array.set;

public class Array3_SecondLargest {

    public static void main(String[] args) {
        int[] arr = {6,4,7,3,2,8};
        //using Sort method:
        int length = arr.length;
        Arrays.sort(arr);
        int Largest = arr[length-1];
        System.out.println(Largest);
        int secondLargest = arr[length-2];
        System.out.println(secondLargest);


        //When an array has duplicate element
        int[] arr2 = {6,4,7,3,2,8,7,8};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        int largest = arr2[arr2.length - 1];
        System.out.println(largest);
        int secondLar = -1;

        for (int i = arr2.length - 2; i >= 0; i--) {
            if (arr2[i] < largest) {
                secondLar= arr2[i];
                break;
            }
        }

        System.out.println("Second Largest (Unique Elements): " + secondLargest);

    }
}
