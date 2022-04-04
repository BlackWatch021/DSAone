/*
*It is based on divide and conquer technique
* STPES
* 1).First divide the array into two half
* 2).These two half are sorted using recursion
* 3).Now merge back these sorted half.
*  */
package com.company.sorting.mergeSort;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
//        sortInPlace(arr,0,arr.length);
//        System.out.println("Sorted array: " +Arrays.toString(arr));
    }


    //Approach 1
    static int[] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=sort(Arrays.copyOfRange(arr,0,mid));//end is not included
        int[] right=sort(Arrays.copyOfRange(arr,mid,arr.length));//end is not included



        return merge1(left,right);
    }

    static int[] merge1(int[] left,int[] right){
        int[] mix=new int[left.length+right.length];

        int i=0;//Left pointer
        int j=0;//Right pointer
        int k=0;//Mix pointer

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        //Case if one of the arrays(left/right) length is smaller than the other
        //Than copy the remaining elements
        while (i < left.length) {
            mix[k]=left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }



}
