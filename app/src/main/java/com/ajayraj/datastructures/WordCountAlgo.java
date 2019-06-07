package com.ajayraj.datastructures;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */

public class WordCountAlgo {

    public static void main(String args[]) {

        String str="I love my india  I love my nation";

        String uprStr= str.toUpperCase();
        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
        String arr[]=uprStr.split(" ");

        for(int i=0;i<=arr.length-1;i++){


            if(hm.containsKey(arr[i])){
                hm.put(arr[i].toString(),hm.get(arr[i])+1);


            }else{
                hm.put(arr[i].toString(),1);
            }


        }

        Iterator<Map.Entry<String ,Integer>> itr=hm.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry<String , Integer > entry=itr.next();

            if(!entry.getKey().equals("")){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }

        }

    }
}


/*  output of the program
I 2
LOVE 2
MY 2
INDIA 1
NATION 1 */
