package com.company.Math;

public class findUniqueInArray {
    public static void main(String[] args) {
        int[] arr={2,4,3,5,3,5,6,4,2};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int count=0;
        for (int n:arr){
            count^=n;
        }
        return count;
    }
    /*
    Here we are using the XOR, to find the unique element in the array. See the debugger for better understanding;
    Note numbers repeats only twice time 
    XOR(^)
    a^a=0
    a^1=complement(a)
    a^0=a;
    * */
}
