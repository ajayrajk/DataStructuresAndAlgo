package com.ajayraj.datastructures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ajayraj.datastructures.LinkedList.CircularLinkedList;
import com.ajayraj.datastructures.LinkedList.DoublyLinkedList;
import com.ajayraj.datastructures.LinkedList.SinglyLinkedList;
import com.ajayraj.datastructures.searching.BinarySearchingAlgo;
import com.ajayraj.datastructures.sorting.BubbleSortingAlgo;
import com.ajayraj.datastructures.sorting.InsertionSortingAlgo;
import com.ajayraj.datastructures.tree.AVLTree;
import com.ajayraj.datastructures.tree.BinarySearchTree;
import com.ajayraj.datastructures.tree.BinaryTreeTraversalIterative;
import com.ajayraj.datastructures.tree.BinaryTreeTraversalRecursive;
import com.ajayraj.datastructures.tree.LevelOrderTreeTraversal;


public class MainActivity extends AppCompatActivity {

    String test[];
    Button btnFibonacci,btnBubble,btnBinaryearch,btnMergeSort,btnReverseWord,
            btnLongestPalindrome,btnInsertionSorting,btnSingleLinkedList,
            btnDoubleLinkedList,btnCircularLinkedList,btnAVL,btnBST,btnBSTTraversal,btnBSTRecursive,btnLevelTree;
    @Override
    protected final  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
          inItView();
          inItListner();

          //start jobIntent
          MyService.enqueueWork(MainActivity.this,MyService.class,1010,new Intent(MainActivity.this, MyService.class));
    }

   private void inItView(){

        btnBubble=findViewById(R.id.btnBubbleSort);

        btnBinaryearch=findViewById(R.id.btnBinarySearch);
        btnFibonacci=findViewById(R.id.btnFibonacci);
        btnInsertionSorting=findViewById(R.id.btnInsertionSot);
        btnLongestPalindrome=findViewById(R.id.btnLongestPalindrome);

        btnReverseWord=findViewById(R.id.btnReverseWord);

        //linked list
       btnSingleLinkedList=findViewById(R.id.btnSingleList);
       btnDoubleLinkedList=findViewById(R.id.btnDoubleList);
       btnCircularLinkedList=findViewById(R.id.btnCircularList);

       //tree
       btnAVL=findViewById(R.id.btnAVL);
       btnBST=findViewById(R.id.btnBST);
       btnBSTRecursive=findViewById(R.id.btnBSTraversalRecusive);
       btnBSTTraversal=findViewById(R.id.btnTraverseIterative);
       btnLevelTree=findViewById(R.id.btnBSLevelorder);


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


       btnSingleLinkedList.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               SinglyLinkedList.main(test);
           }
       });

       btnDoubleLinkedList.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               DoublyLinkedList.main(test);
           }
       });


       btnCircularLinkedList.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               CircularLinkedList.main(test);
           }
       });


       btnAVL.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       AVLTree.main(test);
                   }
               });

       btnBST.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               BinarySearchTree.main(test);
           }
       });

       btnBSTTraversal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               BinaryTreeTraversalIterative.main(test);
           }
       });


       btnBSTRecursive.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               BinaryTreeTraversalRecursive.main(test);
           }
       });



       btnLevelTree.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               LevelOrderTreeTraversal.main(test);
           }
       });


    }


}
