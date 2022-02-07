package com.aditya;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String name = null;
        System.out.println(isPalindrome(name));
    }
    static boolean isPalindrome(String str){
        if ( str == null || str.length()==0 ){
            return true;
        }
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-i-1);

            if (start != end){
                return false;
            }
        }
        return true;

    }
}
