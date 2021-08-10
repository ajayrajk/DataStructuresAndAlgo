package com.ajayraj.datastructures.sorting;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */

1. Method: 
public class SelectionSort{

     public static void main(String []args){
         int arr[]={3, 4, 7, 1, 10, 8, 2, 22, 99, 50};
         
         System.out.println("Before sorting ");
         print(arr);
         selectionSort(arr);
         System.out.println("After sorting");
         print(arr);
     }
     
    static void selectionSort(int arr[]){
         int n=arr.length;
         for (int i=0;i<n-1;i++){
             int min_idx=i;
             for (int j=i+1; j<n ;j++)
                 if(arr[j]<arr[min_idx])
                      min_idx=j;
                 
                      
                     //swap min_idx and j index
                     int temp=arr[min_idx];
                      arr[min_idx]=arr[i];
                      arr[i]=temp;
                 
             
         }
         
     }
     
     static void print(int arr[]){
         for (int i=0;i<arr.length ;i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println(" ");
     }
     
}
2: Method
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
