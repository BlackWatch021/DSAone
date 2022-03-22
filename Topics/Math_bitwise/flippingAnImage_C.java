/*
 Flipping an Image
 https://leetcode.com/problems/flipping-an-image/

 Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].


Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
* */
package com.company.Math_bitwise;

import java.util.Arrays;

public class flippingAnImage_C {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
//        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] returned=flipAndInvertImage(image);
        for (int i = 0; i < returned.length; i++) {
            System.out.println(Arrays.toString(returned[i]));
        }
    }


    /*Approach 1 - Using bit operators
    Steps-
    1.First we will reverse the matrix rows
    2.While we are reversing, we  will apply the XOR operation for inverting the bits

    XOR
    0^1=1;
    1^1=0;
    * */

    static int[][] flipAndInvertImage(int[][] image){
        for (int i = 0; i < image.length; i++) {
                int start=0;
                int end=image[i].length-1;
            for (int j = 0; j <(image[i].length+1)/2 ; j++) {

                int temp=image[i][start]^1;
                image[i][start]=image[i][end]^1;
                image[i][end]=temp;
                start++;
                end--;
            }
        }
        return image;

    }






    /*Approach 2- brute force
    Time complexity=O(2n^2)=> O(n^2)
    Steps
    1.Reverse the matrix rows
    2.Change the numbers 1=>0 and 0=>1
        [1,1,0]        [0,1,1]      [1,0,0]
        [1,0,1],  =>   [1,0,1]  =>  [0,1,0]
        [0,0,0]]       [0,0,0]      [1,1,1]
    *
    * */
//    static int[][] flipAndInvertImage(int[][] image) {
//        for (int i = 0; i < image.length; i++) {
//                int start=0;
//                int end=image[i].length-1;
//            for (int j = 0; j <image[i].length/2 ; j++) {
//
//                int temp=image[i][start];
//                image[i][start]=image[i][end];
//                image[i][end]=temp;
//                start++;
//                end--;
//            }
//        }
//        return invert(image);
//    }
//    static int[][] invert(int[][] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if(arr[i][j]==1){
//                    arr[i][j]=0;
//                }
//                else{
//                    arr[i][j]=1;
//                }
//            }
//        }
//        return arr;
//    }
}
