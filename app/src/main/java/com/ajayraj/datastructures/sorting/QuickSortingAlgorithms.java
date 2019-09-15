package com.ajayraj.datastructures.sorting;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */

public class QuickSortingAlgorithms {

    public static void sortArray(){
        int arr[]={2,18,13,54,34,23,65,56};

        int start=0;
        int end=arr.length-1;


        System.out.print("print array before sorting");
        printArray(arr);
        sort(arr,start,end);

        System.out.print("print array after sorting  ");

        printArray(arr);

    }
    private static void printArray(int arr[]){

        for (int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

    }

    private static void sort(int arr[],int s,int e){

        if (s<e){
            int piv=partition(arr,s,e);
            sort(arr,s,piv-1);
            sort(arr,piv,e);
        }
    }
    private static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    private static int partition(int arr[],int s,int e){
        //we can initilize over here
        int i=0;
        // we can take take the last index of  array as pivot
        int pivt=arr[e];

        for (int j=i;j<e;j++){

            if (arr[j]<=pivt){
                swap(arr,i,j);
               
                i++;

            }
        }

        swap(arr,i,e);
        /*int temp=arr[i];
        arr[i]=arr[e];
        arr[e]=temp;*/
        return i;
    }
}
