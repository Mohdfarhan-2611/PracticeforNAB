package org.example.Arrays;

public class Array1_Largest {

    public static void main(String[] args) {
        //int[] arr = {1,2,3,10,4,5,6};
        int[] arr = {-10, -3, -1, -20};
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println(max);

    }
}
