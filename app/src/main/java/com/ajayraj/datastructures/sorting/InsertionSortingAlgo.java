package com.ajayraj.datastructures.sorting;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */






 1. First Solution:- 
public class HelloWorld{

     public static void main(String []args){
         int arr[]={3, 4, 7, 1, 10, 8, 2, 22, 99, 50};
          System.out.println("Before sorting ");
         print(arr);
         sort(arr);
           System.out.println("after sorting");
         print(arr);
         
     }
     
    static void sort(int arr[]){
          
          for(int i=1;i<arr.length ;i++){
              int key=arr[i];
              int j=i-1;
              
              while(j>=0 && arr[j]>key){
                  arr[j+1]=arr[j];
                  j=j-1;
              }
              arr[j+1]=key;
          }
     }
     
   static void print(int arr[]){
         for (int i=0;i<arr.length ;i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println(" ");
     }
}
 2: Solution 
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
