package com.ajayraj.datastructures.sorting;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */

public class SelectionSortingAlgo {

    public static void main(String args[]) {
        int arr[]= {23,13,25,7,18,4,2,1};

        System.out.println(" before selection sorted Array :");

		/*for(int i=0;i<arr.length;i++) {

		System.out.println(arr[i] + " ");

		}*/

        for(int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }


        System.out.println(" after  selection sorted Array :");

        for(int i=0;i<arr.length;i++) {

            System.out.println(arr[i] + " ");

        }
    }
}
