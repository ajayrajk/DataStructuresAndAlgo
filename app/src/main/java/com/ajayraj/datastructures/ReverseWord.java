package com.ajayraj.datastructures;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */

public class ReverseWord {

    public static void main(String args[]) {
        String str="Java is a use for reverse testing";
        String arr[]=str.split(" ");
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<arr.length;i++){
            int j=0;
            for(j=arr[i].length()-1;j>=0;j--){
                sb.append(arr[i].charAt(j));
            }

            sb.append(" ");

        }

        System.out.println(sb);


    }
}
