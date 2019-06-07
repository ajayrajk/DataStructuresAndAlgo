package com.ajayraj.datastructures;

/**
 * apttrix.com
 * Created by Ajay Raj on 07,June,2019
 */

public class StackOperation {

    private int top;
    private int maxSize=1000;

    int a[]=new int[maxSize];

    StackOperation() {
        top = -1;

    }

    boolean isEmpty(){
        return top<0;
    }

    boolean push(int x){

        if (top>=maxSize-1){
            System.out.println("Stack overflow");
            return false;
        }else{
            a[++top]=x;
            System.out.println("push "+x+" in stack successfully");


            return  true;
        }

    }

    int pop(){

        if (top<0){
            System.out.println("Stack underflow");
            return -1;
        }else{
            int x= a[top--];
            return  x;
        }

    }

    public static void main()
    {
        StackOperation s = new StackOperation();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack ");
    }
}
