/*Return all the places where the target appears in the given array*/
package com.company.recursion;

import java.util.ArrayList;

public class linearSearchAllInstances_C {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,5,6,3,2,5,64,2};
        int target=3;
        System.out.println(search(arr,target));
    }
    static ArrayList search(int[] arr,int target){
        ArrayList<Integer> res=new ArrayList<Integer>();
        return helper(arr,target,0,res);
    }
    static ArrayList helper(int[] arr,int target,int index,ArrayList res){
        if(index==arr.length){
            return res;
        }
        else if(arr[index]==target){
            res.add(index);
        }
            return helper(arr,target,index+1,res);

    }
}
