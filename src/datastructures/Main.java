package datastructures;

import datastructures.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        linkedList.printList();

        System.out.println("Result: " + linkedList.get(3).value);
    }
}