/*
String Builder
its a datatype similar to that of string, but it is mutable. Means any change in this will be applied directly to the
object rather than creating a new object with each change like String.
* */
package com.company.string;

public class SB_C {
    public static void main(String[] args) {
        /*Here we are printing all the alphabets using the string. The problem here is that with each change a new object is created.
        * Means a total of 26 objects were created but only the last one is used while rest of all are now useless*/
//        String alphabets="";
//        for (int i = 0; i < 26; i++) {
//            char ch=(char)('a'+i);
//            alphabets+=ch;
//            System.out.println(alphabets);
//        }

//        StringBuilder alphabets1=new StringBuilder("");
//        for (int i = 0; i < 26; i++) {
//            char ch=(char)('a'+i);
//            alphabets1.append(ch);
//        }
//        System.out.println(alphabets1);

        //StringBuilder methods
        StringBuilder methods=new StringBuilder("JOHN wick");
//        System.out.println(methods.append('H'));
//        System.out.println(methods.append("HeyMan"));
//        System.out.println(methods.append(69));
//        System.out.println(methods.delete(0,1));//(Start index,elements to delete);
//        System.out.println(methods.indexOf("HN"));//(string)
//        System.out.println(methods.indexOf("ck"));//(string)//error
//        System.out.println(methods.deleteCharAt(4));
//        System.out.println(methods.insert(4,'$'));//indert(at,whatToAdd)
//        System.out.println(methods.insert(4,"$%^"));
//        System.out.println(methods.indexOf("H",4));//indexOf(string,fromIndex)
//        System.out.println(methods.replace(5,methods.length(),"WICK"));
//        System.out.println(methods.charAt(2));
//        System.out.println(methods.reverse());

    }

}
