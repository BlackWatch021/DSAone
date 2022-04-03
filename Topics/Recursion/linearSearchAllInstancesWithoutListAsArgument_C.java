/*Return all the places where the target appears in the given array, but you can't pass list as the argument*/
package com.company.recursion;

import java.util.ArrayList;

public class linearSearchAllInstancesWithoutListAsArgument_C {
    public static void main(String[] args) {
        int[] arr={2,3,2,5,6,3,4,5};
        int target=9;
        System.out.println(search(arr,target));
    }
    static ArrayList search(int[] arr, int target){
        return helper(arr,target,0);
    }

    static ArrayList helper(int[] arr, int target, int index) {
        ArrayList<Integer> list=new ArrayList<>() ;
        if(index==arr.length){
            return list;
        }
        else if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> returnedList = helper(arr,target,index+1);
        list.addAll(returnedList);
        return list;
    }
}
