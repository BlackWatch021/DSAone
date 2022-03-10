/*
Given an array and a number k, we have to return the kth  smallest element from the array;

example 1
arr=[1,42,3,5];
k=3;
output= 5
explanation= number 5 is the 3rd smallest number in the the array

example 2
arr=[2,5,3,1,22,66,33,74,23,75,11,522,13,6642]
k=5;
output=11
explanation= number 11 is the 5th smallest number in the the array
* */
package com.company;

import java.util.Arrays;

public class KthSmallestElement_C {
    public static void main(String[] args) {
        int[] arr={2,5,3,1,22,66,33,74,23,75,11,522,13,6642};
        int k=5;
        System.out.println(kthSmallest(arr,k));
    }
    static int kthSmallest(int[] arr, int k){
        for (int i = 0; i <arr.length; i++) {
            int big=arr[0];
            int index=0;
            for (int j = 0; j <=arr.length-i-1; j++) {
                if(arr[j]>big){
                    big=arr[j];
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
        System.out.println(Arrays.toString(arr));
        return arr[k-1];
    }
}
