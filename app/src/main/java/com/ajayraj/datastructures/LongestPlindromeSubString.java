package com.ajayraj.datastructures;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */

public class LongestPlindromeSubString {
//forgeeksskeegfor
    private static int start=0;
    private static  int maxlen=1;

    public static String longestPalindrome(String s){
        int len=s.length();

        if (len<=1) return s;  // in case if length of string
        for (int i=0;i<len;i++){

            helper(s,i-1,i+1); // for getting odd subString
            helper(s,i,i+1);         // for getting even
        }

        System.out.println("Palindrome test"+s.substring(start,start+maxlen));
        return s.substring(start,start+maxlen);
    }

    public static  void helper(String str,int head,int tail){
        while (head>=0 && tail< str.length() &&
                str.charAt(head)==str.charAt(tail)){
            int len=tail-head+1;
            if (len>maxlen){
                maxlen=len;
                start=head;
            }
            head--;
            tail++;

        }
    }
}
