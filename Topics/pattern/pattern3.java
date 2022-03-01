/*
print this pattern
* * * * *
* * * *
* * *
* *
*

* */
package com.company.pattern;

public class pattern3 {
    public static void main(String[] args) {
        int num=5;
        pattern(num);
    }
    static void pattern(int num){
        for (int i = 0; i < num; i++) {
            for (int j = num-i; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
