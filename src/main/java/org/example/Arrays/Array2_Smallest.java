package org.example.Arrays;

public class Array2_Smallest {

    public static void main(String[] args) {
        int[] arr = {1,2,3,10,4,5,6};
        int min = arr[0];

        for( int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println(min);
    }
}
