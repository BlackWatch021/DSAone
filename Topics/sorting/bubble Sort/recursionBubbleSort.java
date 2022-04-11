package com.company.sorting.bubbleSort;

import java.util.Arrays;

public class recursionBubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4,23,63,0,-1, 5, 1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        return helper(arr,arr.length-1, 0);
    }
    static int[] helper(int[] arr,int start,int end){
        if(start==0){
            return arr;
        }
        else if(end<start){
            if(arr[end]>arr[end+1]){
                int temp=arr[end];
                arr[end]=arr[end+1];
                arr[end+1]=temp;
                return helper(arr, start,end+1);
            }
            else{
                return helper(arr,start,end+1);
            }
        }
        return helper(arr,start-1,0);
    }
}