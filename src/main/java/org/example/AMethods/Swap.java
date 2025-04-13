package org.example.AMethods;

public class Swap {


    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        swap1(a, b);

        System.out.println(a + " "+ b);

        int[] arr = {10, 20};
        swap2(arr);

        System.out.println(arr[0] + " "+ arr[1]);

    }

   static void swap1(int a, int b)
    {

        int temp = a;
        a = b;
        b =temp;

    }

    static void swap2(int[] arr)
    {

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] =temp;

    }
}
