/*
  print this pattern
 *
 * *
 * * *
 * * * *

 */
package com.company.pattern;

public class pattern1 {
    public static void main(String[] args) {
        int num=4;
        pattern(num);
    }
    static void pattern(int num){
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
