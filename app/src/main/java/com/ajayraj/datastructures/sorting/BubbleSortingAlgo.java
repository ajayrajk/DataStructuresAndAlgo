package com.ajayraj.datastructures.sorting;

/**
 * apttrix.com
 * Created by Ajay Raj on 01,June,2019
 */

public class BubbleSortingAlgo {
    public static void main(String args[]) {
        int arr[]= {23,13,25,7,18,4,2,1};

        System.out.println(" before bubble sorted Array :");

		/*for(int i=0;i<arr.length;i++) {

		System.out.println(arr[i] + " ");

		}*/

        for(int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


        System.out.println(" after  bubble sorted Array :");

        for(int i=0;i<arr.length;i++) {

            System.out.println(arr[i] + " ");

        }
    }



}
