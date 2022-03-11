package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = {16,21,11,8,12,22};

        System.out.println("Verilen dizi\n" + Arrays.toString(arr));


        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSıralanmış dizi\n" + Arrays.toString(arr));
    }
}
