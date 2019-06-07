package com.ajayraj.datastructures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String test[];
    Button btnFibonacci,btnBubble,btnBinaryearch,btnMergeSort,btnReverseWord,btnLongestPalindrome,btnInsertionSorting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
          inItView();
          inItListner();
    }

   private void inItView(){

        btnBubble=findViewById(R.id.btnBubbleSort);

        btnBinaryearch=findViewById(R.id.btnBinarySearch);
        btnFibonacci=findViewById(R.id.btnFibonacci);
        btnInsertionSorting=findViewById(R.id.btnInsertionSot);
        btnLongestPalindrome=findViewById(R.id.btnLongestPalindrome);

        btnReverseWord=findViewById(R.id.btnReverseWord);

   }

   private void inItListner(){


        // bubble sorting
        btnBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BubbleSortingAlgo.main(test);
            }
        });

        //binary search algo
        btnBinaryearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BinarySearchingAlgo.main(test);
            }
        });
       //binary search algo
       btnFibonacci.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               FibonacciSeries.main();
           }
       });

       //insertion sorting
       btnBinaryearch.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               InsertionSortingAlgo.main(test);
           }
       });
       //longest palindrome
       btnBinaryearch.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               LongestPlindromeSubString.longestPalindrome("forgeeksskeegfor");
           }
       });


       btnReverseWord.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               ReverseWord.main(test);
           }
       });


   }
}
