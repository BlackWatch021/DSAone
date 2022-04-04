/*Implementing quickSort
* In this we take a pivot element, and we place it in its correct index after each pass.
* i.e.   The left elements of the pivot should be smaller than it and right elements should be greater than it
* At this point we aren't interested in sorting the left/right array.
*
* The pivot element can be selected as-
* 1)Corner element as the pivot
* 2)Any random element as the pivot
* 3)Middle element as the pivot element
*
*
*
* But it is advised to always select the middle elements as the pivot point
*
*Time Complexity=O(nlogn)
* Worst time Complexity=O(N^2)*/

package com.company.sorting.quickSort;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }

        int start=low;//Initially
        int end=high;//Initially
        int mid=low+(high-low)/2;
        int pivot= arr[mid];

        while(start<=end){
            while(arr[start]<arr[mid]){
                start++;
            }
            while(arr[end]>arr[mid]){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }

        sort(arr,low,end);
        sort(arr,start,high);

    }
}
