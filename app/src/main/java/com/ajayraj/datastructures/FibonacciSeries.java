package com.ajayraj.datastructures;

/**
 * apttrix.com
 * Created by Ajay Raj on 01,June,2019
 */

public class FibonacciSeries {
    private static void fibonaciSeries(){
    int start=0,end=1,sum;
    for (int i=0;i<20;i++){
        System.out.println(start);
        sum=start+end;
        start=end;
        end=sum;

    }



}
    public static void main()
    {
        fibonaciSeries();
    }


}