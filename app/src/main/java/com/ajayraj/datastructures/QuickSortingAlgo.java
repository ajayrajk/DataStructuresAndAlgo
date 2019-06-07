package com.ajayraj.datastructures;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */

public class QuickSortingAlgo {

    int partiton(int arr[],int low,int high) {
        int pivot = arr[high];

        int i=low;

        for(int j=low;j<high;j++) {

            if(arr[j]<=pivot) {

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }


        }
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }

    void sort(int arr[],int low,int high) {
        if(low < high) {
            int pi=partiton(arr,low,high);
            sort(arr,low,pi-1);
            sort(arr,pi,high);
        }

    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[]= {23,13,25,7,18,4,2,1};
        int len=arr.length;
        QuickSortingAlgo qs=new QuickSortingAlgo();
        qs.sort(arr, 0, len-1);

        System.out.println(" after  quick sorted Array :");
        printArray(arr);
        for(int i=0;i<len;++i) {

            System.out.println(arr[i] + " ");

        }
    }
}
