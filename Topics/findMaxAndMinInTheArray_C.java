/*
* Given an array of number, return the smallest and the biggest number present in the array.
* */
package com.company;

import java.util.Arrays;

public class findMaxAndMinInTheArray_C {
    public static void main(String[] args) {
        int[] arr={3, 2, 1, 56, 10000, 167};
        System.out.println(Arrays.toString(getMinMax(arr)));;
    }
    static int[] getMinMax(int[] arr)  {
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int[] ans={min,max};
        return ans;
    }
}
