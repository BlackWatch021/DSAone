/*
*  Shuffle String
* https://leetcode.com/problems/shuffle-string/
*
* You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.



Example 1:


Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Example 2:

Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
* */
package com.company.string;

public class shuffleString_C {
    public static void main(String[] args) {
        String str="abc";
        int[] indices={0,1,2};
        System.out.println(restoreString(str,indices));
//        StringBuilder st=new StringBuilder("HIma");
//        System.out.println(st.insert(3,'h'));
    }
    static String restoreString(String s, int[] indices) {
        StringBuilder temp=new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            String character=s.substring(i,i+1);
            temp.replace(indices[i],indices[i]+1,character);
//            temp.insert(indices[i],character);
        }
       s=temp.toString();
       return s;
    }

    //Faster solution
//    static String restoreString(String s, int[] indices) {
//        char temp[] = new char[indices.length];
//        for (int i = 0; i < indices.length; i++) {
//            temp[indices[i]] = s.charAt(i);
//        }
//        return new String(temp);
//    }
}

