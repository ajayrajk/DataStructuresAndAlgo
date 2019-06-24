package com.ajayraj.datastructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */

public class StringProblems {

    // problem 1:  print duplicate character
    public static void printDuplicateChar() {

        String str = "Ajay Rajput";

        HashMap<Character, Integer> duplicateMap = new HashMap<>();


        char wordArray[] = str.toCharArray();
        for (Character ch : wordArray) {


            if (duplicateMap.containsKey(ch)) {

                duplicateMap.put(ch, duplicateMap.get(ch) + 1);
            } else {
                duplicateMap.put(ch, 1);
            }
        }


        System.out.println(duplicateMap);

        Iterator<Map.Entry<Character, Integer>> itr = duplicateMap.entrySet().iterator();
        System.out.println("Duplicate character print here");

        while (itr.hasNext()) {

            Map.Entry<Character, Integer> entry = itr.next();
            if (entry.getValue() > 1 && !entry.getKey().equals(" "))
                System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
    // problem 2: check anagram number

    public static boolean checkAnagram(String str1, String str2) {
        //boolean isAnagram = false;
        char character[] = str1.toLowerCase().toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str2);
        if (str1.length() != str2.length())
            return false;


        for (Character ch : character) {

            int index = stringBuffer.indexOf("" + ch);

            if (index != -1) {
                stringBuffer.deleteCharAt(index);
            } else return false;
        }


        return stringBuffer.length() == 0 ? true : false;
    }


    // problem 3:

    public static char firstNonRepeatingChar(String str1) {
        char firstChar = ' ';
        char character[] = str1.toLowerCase().toCharArray();
//use linked hashMap bcz we have need for order
        Map<Character, Integer> characterIntegerHashMap = new LinkedHashMap<>();


        for (Character ch : character) {


            if (characterIntegerHashMap.containsKey(ch)) {

                characterIntegerHashMap.put(ch, characterIntegerHashMap.get(ch) + 1);
            } else {
                characterIntegerHashMap.put(ch, 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : characterIntegerHashMap.entrySet()) {

            if (entry.getValue() == 1) {
                firstChar = entry.getKey();
                break;
            }

        }
        return firstChar;
    }


    // problem 4:

    public static void reverseString(){

        String revStr="Ajay Rajput";

        StringBuffer stringBuffer=new StringBuffer();
        char charArray[]=revStr.toCharArray();
        for (int i=charArray.length-1;i>=0;i--){
            stringBuffer.append(charArray[i]);
        }

        System.out.println("Reverse String  \n"+stringBuffer);

        // second way

        StringBuffer strBuffer=new StringBuffer(revStr);

        strBuffer.reverse();

        System.out.println("Reverse String  \n"+strBuffer);



    }

    // problem 5:

    public static void countConsonantVolels(){
        String strCount="There is a many subString found";

        char [] charArray=strCount.toLowerCase().toCharArray();

        int count=0 ,space=0;
        for (char ch:charArray){

            switch (ch){

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;


                    break;
                case ' ':

                    space++;

                    break;
                default:
            }
        }


        System.out.println("Vovels is "+count +" consonants is "+(charArray.length-(count+space)));
    }


    //reverse the array
    public static void reverseArray(){
        int arr[]={1,2,3,4,6,7,8,12,13};

        System.out.println("before reverse  the array");
        printArray(arr);

        int s=0,e=arr.length-1;
        int temp;
        while (s<e){
            temp =arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        System.out.println("after reverse  the array");
        printArray(arr);


    }

    private static void printArray(int arr[]){

        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

        System.out.println("end sort the array");

    }



    public static  void  reverseNumber(){

        int n=123456;
        int rem=0,rev=0;


        while (n>0){

            rem=n%10;  //take the last digit
            rev=rev*10+rem;
            n/=10;

        }

        System.out.println(rev);
    }
}
