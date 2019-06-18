package com.ajayraj.datastructures.Stack;

import java.util.Stack;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */

public class StackOperationUsingJava {

    //push data to stack
    static void push_data(Stack<Integer> stack) {
        for (int i = 1; i < 6; i++) {
            stack.push(i);
        }
    }

    //pop data from stack
    static void pop_data(Stack<Integer> stack) {
        System.out.println("pop data from stack one by one " );

        for (int i = 1; i < 6; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println("pop data from stack " + y);
        }
    }
    //peek data from stack
    static void peek_data(Stack<Integer> stack) {

        if (!stack.empty()){
            Integer y = (Integer) stack.peek();
            System.out.println("peek data from stack " + y);
        }
        else{
            System.out.println("stack is underflow");

        }


    }
    //search data from stack
    static void search_data(Stack<Integer> stack,int search) {
        if (!stack.empty()) {
            Integer y = (Integer) stack.search(search);
            System.out.println("search data from stack element "+search +" at "+ y+" position");
        }else{
            System.out.println("stack is underflow");

        }
    }

    public static void main() {
        Stack<Integer> stack = new Stack<>();

        System.out.println("push  data to stack one by one " );
        push_data(stack);

        pop_data(stack);

        System.out.println("push  data to stack one by one " );
        push_data(stack);


        search_data(stack,4);
        search_data(stack,6);
        search_data(stack,5);
        search_data(stack,2);

        peek_data(stack);

    }
}
