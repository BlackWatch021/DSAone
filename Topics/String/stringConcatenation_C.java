/*
the operator '+' is defined to be used either with primitive or one of the value should be primitive.
that is
1)primitive + primitive
2)primitive + anything else
* */
package com.company.string;

import java.util.ArrayList;

public class stringConcatenation_C {
    public static void main(String[] args) {
        System.out.println(('a'+'b'));
        System.out.println((char)('a'+1));
        System.out.println(('a'+"Hey"));
        System.out.println("John"+" Wick");
        System.out.println((""+'a'+'b'));
        System.out.println(new ArrayList<>()+"");
        System.out.println(new ArrayList<>()+"John");
        System.out.println(new ArrayList<>()+""+new ArrayList<>());
//        System.out.println(new ArrayList<>()+new ArrayList<>());        //This will give error, as not a single value is string
    }
}
