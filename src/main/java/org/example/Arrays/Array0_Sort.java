package org.example.Arrays;

import java.util.Arrays;

public class Array0_Sort {

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,4,2,0,9,8,7};

        System.out.println(arr.length);

        for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        }

        System.out.println(Arrays.toString(arr));
    }
}
