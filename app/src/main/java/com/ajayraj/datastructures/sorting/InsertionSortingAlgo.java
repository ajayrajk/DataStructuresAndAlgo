package com.ajayraj.datastructures.sorting;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */

public class InsertionSortingAlgo {

    public static void main(String args[]) {
        int arr[]= {23,13,25,7,18,4,2,1};

        System.out.println(" before insertion sorted Array :");

		/*for(int i=0;i<arr.length;i++) {

		System.out.println(arr[i] + " ");

		}*/

        for(int i=1;i<arr.length;i++) {
            for(int j = i ; j > 0 ; j--){
                int temp=arr[i];
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else break;
            }
        }


        System.out.println(" after  insertion sorted Array :");

        for(int i=0;i<arr.length;i++) {

            System.out.println(arr[i] + " ");

        }
    }

}
