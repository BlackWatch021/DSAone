/*
https://www.codingninjas.com/codestudio/contests/codekaze/problems/18122?leftPanelTab=1
* Find Max Sum
* You are given a matrix with ‘N’ rows and ‘M’ columns containing positive integers. You have to print the maximum sum of elements over all the rows of the matrix.
For Example:
If N=2 , M=2 and matrix = [[1,2], [2,3]]
Sum of elements of the first row = 1 + 2 =3.
Sum of elements of the second row = 2 + 3 =5.
The maximum sum of elements over all the rows of the matrix is 5.
Hence, the output is 5.
Input Format :
The first line of the input contains an integer, 'T’, denoting the number of test cases.

The first line of each test case will contain two space-separated integers ‘N’ and ‘M’, denoting the number of rows and columns of the matrix respectively.

Then ‘N’ lines follow, each containing ‘M’ space-separated integers. The j-th integer in the i-th line is num(i,j).
Output Format :
For each test case, print the maximum sum of elements over all the rows of the matrix.

Print a separate line for each test case.
Note :
You do not need to print anything, it has already been taken care of. Just implement the given function.
* */
package com.company;

public class findMaxSum {
    public static void main(String[] args) {
        int[][] num={{1,2}, {2,3}};
        System.out.println(findMax(num));
    }
    static int findMax(int num[][]) {
        int max=0;
        int test=0;
        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                test+=num[i][j];
            }
            if(test>max){
                max=test;
            }
            test=0;
        }
        return max;
    }
}
