/*
  print this pattern
    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1

 */
package com.company.pattern;

public class pattern8 {
    public static void main(String[] args) {
        int num=5;
        pattern(num);
    }
    static void pattern(int num){
        for (int i = 1; i <= 2*num-1; i++) {
            int c=i>num?2*num-i:i;
            for (int j = 0; j <num-c; j++) {
                System.out.print(" ");
            }
            for (int j = c; j >0 ; j--) {
                System.out.print(j);
            }
            for (int j =2; j<=c ; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
        }
    }

