/*
Print this pattern
 * * * *
 * * *
 * *
 *

 */
package com.company.pattern;

public class recursionPattern1 {
    public static void main(String[] args) {
        pattern1(4,0);
    }

    static void pattern1(int row,int col){
            if(row==0){
                return;
            }
        if (col<row){
            System.out.print("* ");
            pattern1(row,col+1);
        }
        else{
            System.out.println();
            pattern1(row-1,0);
        }
    }





//    static void pattern1(int times){
//        if(times==0){
//            return;
//        }
//        for (int i = 0; i < times; i++) {
//        System.out.print("* ");
//        }
//        System.out.println();
//         pattern1(times-1);
//    }
}
