package datastructures;

import datastructures.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(3);
        myLinkedList.append(5);
        myLinkedList.append(8);
        myLinkedList.append(5);
        myLinkedList.append(10);
        myLinkedList.append(2);
        myLinkedList.append(1);
        // 3 5 8 5 10 2 1
        // x: 5 d1 ----> 3 2 1
        //      d2 ----> 5 8 5 10
        // 3 2 1 5 8 5 10

        myLinkedList.partitionList(5);
//        myLinkedList.printList();
    }
}