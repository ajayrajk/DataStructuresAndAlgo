package com.ajayraj.datastructures.sorting;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */

public class MegeSortingAlgo {


    void sort(int arr[],int s,int e) {
        if(s<e) {
            int mid=(e+s)/2;
            sort(arr,s,mid);
            sort(arr,mid+1,e);
            mergeSort(arr,s,mid,e);
        }


    }
    void 	mergeSort(int arr[],int s,int m,int e){
        int i=s;
        int j=m+1;
        int k=0;
        int temp[]=new int[e-s+1];
        //merge from two sub array
        while(i<=m && j<=e ) {
            if(arr[i]<=arr[j]) {
                temp[k]=arr[i];
                i++;

            }else {
                temp[k]=arr[j];
                j++;
            }

            k++;
        }


        // merge remaining first subarray

        while(i<=m) {
            temp[k]=arr[i];
            k++;i++;
        }

// merge remaining second subarray

        while(j<=e) {
            temp[k]=arr[j];
            k++;j++;
        }

        // copy temp to original interval
        for(i = s; i <= e; i += 1) {
            arr[i] = temp[i -s];
        }

        System.out.println("one sort");
        printArray(arr);
    }

    static  void printArray(int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String ars[]) {

        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MegeSortingAlgo ob = new MegeSortingAlgo();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

}
