/*
  print this pattern
4 4 4 4 4 4 4 4 4
4 3 3 3 3 3 3 3 4
4 3 2 2 2 2 2 3 4
4 3 2 1 1 1 2 3 4
4 3 2 1 0 1 2 3 4
4 3 2 1 1 1 2 3 4
4 3 2 2 2 2 2 3 4
4 3 3 3 3 3 3 3 4
4 4 4 4 4 4 4 4 4


Approach
Imagine a wall on each side of the matrix, the  element at a particular index is equal to the minimum value of its distance from
the walls Math.min(top,bottom,left, right).
Then subtract it from the original value of n for this pattern.
   -------------------
   |4 4 4 4 4 4 4 4 4|
   |4 3 3 3 3 3 3 3 4|
   |4 3 2 2 2 2 2 3 4|
   |4 3 2 1 1 1 2 3 4|
   |4 3 2 1 0 1 2 3 4|
   |4 3 2 1 1 1 2 3 4|
   |4 3 2 2 2 2 2 3 4|
   |4 3 3 3 3 3 3 3 4|
   |4 4 4 4 4 4 4 4 4|
-------------------
 */
package com.company.pattern;

public class pattern9 {
    public static void main(String[] args) {
        int num=4;
        pattern(num);
    }
    static void pattern(int num){
        int original=num;
        num=num*2;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <=num; j++) {
                int numAtTheIndex=original-Math.min(Math.min(i,j),Math.min(num-j,num-i));
                System.out.print(numAtTheIndex+" ");
            }
            System.out.println(" ");
        }
    }
}
