package com.ajayraj.datastructures.LinkedList;

/**
 * apttrix.com
 * Created by Ajay Raj on 18,June,2019
 */

public class SinglyLinkedList{

    public static void main(String[] args) {

        System.out.println("Insert linkedlist");
        LinkedList list= new LinkedList();

        System.out.println("Insert at beginning");
        list.insertBeginning(1);
        list.print();


        System.out.println("Insert at beginning");
        list.insertBeginning(2);
        list.print();

        System.out.println("Insert at end");
        list.insertEnd(4);
        list.print();

        System.out.println("Insert at intermediate");
        list.insertIntermediate(3, 1);
        list.print();

        System.out.println("Insert at end");
        list.insertEnd(5);
        list.print();

        System.out.println("delete at fisrt");
        list.deleteBeginning();
        list.print();

        System.out.println("delete at end");
        list.deleteEnd();
        list.print();

        System.out.println("delete at intermediate");
        list.deleteIntermediate(2);
        list.print();

    }

    public static class LinkedList {

        private ListNode head;
        private int size;

        public LinkedList() {
        }           //default constructor

        //insertion-------------------------------------------
        //beginning
        public void insertBeginning(int data) {
            //create new node and put the data to new node
            ListNode node = new ListNode(data);

            //make next of new node as head
            node.setNext(head);

            // make head to the new node
            head = node;

            //increase the size of linkedlist
            size++;
        }

        //end
        public void insertEnd(int data) {
            //create the new node as the last node
            ListNode node = new ListNode(data, null);

            //get the head node
            ListNode temp = head;


            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
            size++;

        }

        //intermediate
        public void insertIntermediate(int data, int pos) {
            ListNode node = new ListNode(data);

            //get the head of the linkedlist
            ListNode temp = head;
            for (int i = 1; i < pos; i++) {
                  //traverse till postions
                temp = temp.getNext();
            }

            //make the next of new node as next of pre node
            node.setNext(temp.getNext());

            //make next of prev node as next node
            temp.setNext(node);

            size++;
        }

        //deletion------------------------------------------
        //beginning
        public void deleteBeginning() {
            if (head == null) {
                System.out.println("List is empty.");
            } else {

                //get the head node
                ListNode temp = head;

                //point as head to the next node
                head = head.getNext();

                //set head as a null value
                temp.setNext(null);
                size--;
            }
        }

        //end
        public void deleteEnd() {

            if (head == null) {
                System.out.println("List is empty.");
            } else {

                ListNode posNode = head;         //position node
                ListNode preNode = null;             //previous node to position
                while (posNode.getNext() != null) {
                    preNode = posNode;
                    posNode = posNode.getNext();
                }
                preNode.setNext(null);
                size--;
            }
        }

        //intermediate
        public void deleteIntermediate(int pos) {

            ListNode posNode = head;         //position node
            ListNode preNode = null;             //previous node to position
            for (int i = 1; i < pos; i++) {
                preNode = posNode;
                posNode = posNode.getNext();
            }
            preNode.setNext(posNode.getNext());
            posNode.setNext(null);
            size--;
        }

        public void print() {
            System.out.println("");
            if (head == null) {
                System.out.println("List is empty.");
            } else {
                ListNode temp = head;
                do {
                    System.out.print(temp.getData() + "  ");
                    temp = temp.getNext();
                } while (temp != null);
            }

        }

        private static class ListNode {

            private int data;
            private ListNode next;

            public ListNode() {
            }

            public ListNode(int data) {
                this.data = data;
            }

            public ListNode(int data, ListNode next) {
                this.data = data;
                this.next = next;
            }

            public int getData() {
                return data;
            }

            public void setData(int data) {
                this.data = data;
            }

            public ListNode getNext() {
                return next;
            }

            public void setNext(ListNode next) {
                this.next = next;
            }
        }
    }
}
