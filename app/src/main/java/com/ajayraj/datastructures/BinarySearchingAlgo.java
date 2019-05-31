package com.ajayraj.datastructures;

/**
 * apttrix.com
 * Created by Ajay Raj on 01,June,2019
 */

public class BinarySearchingAlgo {


    public static void main(String args[]) {

        int arr[]= {2,6,7,10,13,15,17,23,34,45,54};

        BinarySearchingAlgo binarySearch=new BinarySearchingAlgo();

        int find=binarySearch.search(arr,60);
        if(find==-1) {
            System.out.println("key not find");
        }else {
            System.out.println("key  find at index "+find );
        }
    }

    int search(int arr[],int keyIndex) {
        int l = 0, r = arr.length - 1;
        while (l <= r)
        {
            int m = (r+l)/2;

            // Check if x is present at mid
            if (arr[m] == keyIndex)
                return m;

            // If x greater, ignore left half
            if (arr[m] < keyIndex)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;

    }

}
