/*
A quick go through for java
to use placeHolders, we have to use .printf(), not .println().
%c - Character
%d - Decimal number (base 10)
%e - Exponential floating-point number
%f - Floating-point number
%i - Integer (base 10)
%o - Octal number (base 8)
%s - String
%u - Unsigned decimal (integer) number
%x - Hexadecimal number (base 16)
%t - Date/time
%n - Newline
* */

package com.company.string;

public class placeHolder_C {
    public static void main(String[] args) {
        //using %s (string) placeholder
        String a="Himanshu";
        String b="Negi";
        System.out.printf("Hey i am %s and my last name is %s%n",a,b);


        System.out.printf("Hey there, its a line break %nfor this we have to use 'n' placeholder%n");
        System.out.printf("Now we are using the char placeholder %c %c %c %c%n",'A','B','C','D');
        System.out.printf("Now we are using the escape 'Character', for this we will use '\\'  (backslash)");
    }
}
