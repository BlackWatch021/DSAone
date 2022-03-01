/*
print this pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

* */
package com.company.pattern;

public class pattern4 {
    public static void main(String[] args) {
        int num=5;
        pattern(num);
    }
    static void pattern(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
