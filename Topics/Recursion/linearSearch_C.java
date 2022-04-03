package com.company.recursion;

public class linearSearch_C {
    public static void main(String[] args) {
        int[] num={1,2,5,3,4,6};
        int target=6;
        System.out.println(linear1(num,target));
        System.out.println(linear2(num,target));
    }
    static boolean linear1(int[] arr,int target){
        return helper1(arr,target,0);
    }
    //For boolean

    static boolean helper1(int[] arr, int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || helper1(arr,target,index+1);
    }


//For index

    static int linear2(int[] arr,int target){
        return helper2(arr,target,0);
    }
    static int helper2(int[] arr, int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return helper2(arr,target,index+1);
    }
}
