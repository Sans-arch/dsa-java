package datastructures;

import datastructures.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(11);
        linkedList.append(3);
        linkedList.append(23);
        linkedList.append(7);

        linkedList.reverse();

        linkedList.printList();
    }
}