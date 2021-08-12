package com.ajayraj.datastructures.sorting;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */

1: Methods:
public class MergerSort{

     public static void main(String []args){
       int arr[] = {12, 11, 13, 5, 6, 7, 67, 2};

        System.out.println("Given Array");
        printArray(arr);

        /*MergerSort ob = new MergerSort();
        ob.*/
        mergeSort(arr, arr.length);

        System.out.println("\nSorted array");
        printArray(arr);
     }
     /* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
    static void mergeSort(int arr[], int n){
         //if size is 1 then simply return 
         if(n<2)
         return ;
         
         //find mid in array
        int mid=n/2;
        //int m =l+ (r-l)/2;

         
         //create left and right array
         int leftArray[]=new int[mid];
         int rightArray[]=new int[n-mid];
         
         //fill left and right array
         for(int i=0;i<mid;i++)
         leftArray[i]=arr[i];
         
         for(int i=mid;i<n;i++)
         rightArray[i-mid]=arr[i];
         
         
        // again apply on left sub array
        // pass end index of left array
        mergeSort(leftArray,mid);
        
        // again apply on right sub array
        // pass end index of right array
        mergeSort(rightArray,n-mid);
        

        // merge left and right sub array
	//pass arr , left array , right array , end idex of left array and end index of right array.
        merge(arr,leftArray,rightArray,mid,n-mid);
        
    }
    
   static void merge(int arr[],int leftArray[],int rightArry[],
   int left, 
     int right){
         int i=0,j=0,k=0;
         
         while(i<left && j<right){
             if(leftArray[i]<rightArry[j]){
                 arr[k++]=leftArray[i++];
             }else {
               arr[k++]=rightArry[j++];
             }
         }
         
         //fill all remaining items from leftArray
         while(i<left){
             arr[k++]=leftArray[i++];
         }
         
         //fill all remaining items from rightArray
         while(j<right){
             arr[k++]=rightArry[j++];
         }
         
         
     }
}

2: Methods:
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
