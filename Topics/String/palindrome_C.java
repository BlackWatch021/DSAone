/*There are lots of ways to find whether the given string is palindrome or not. But we will see one of the most basic solution*/
package com.company.string;

public class palindrome_C {
    public static void main(String[] args) {
      String str=null;
        System.out.println(palindromeChecker(str));
    }
    static boolean palindromeChecker(String str){
        if(str==null||str.length()==0){
            return true;
        }
        str=str.toLowerCase();
        for (int i = 0; i <= str.length()/2; i++) {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
