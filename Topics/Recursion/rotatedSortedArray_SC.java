package com.company.recursion;

public class rotatedSortedArray_SC {
    public static void main(String[] args) {
        int[] arr={5,6,7,1,2,3,4};
        int target=9;
        System.out.println(search(arr,target));
    }

    private static int search(int[] arr, int target) {
        return helper(arr,target,0,arr.length-1);
    }

    private static int helper(int[] arr, int target, int start, int end) {
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[start]<arr[mid]){
            if(arr[start]<=target && arr[mid]>=target){
                return helper(arr,target,start,mid-1);
            }
            else{
                return helper(arr,target,mid+1,end);
            }
        }
        else if(target>=arr[mid] && target<=arr[end]){
            return helper(arr,target,mid+1,end);
        }
        return helper(arr,target,start,end-1);

    }
}
