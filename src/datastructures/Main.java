package datastructures;

import datastructures.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(11);
        linkedList.append(3);
        linkedList.append(23);
        linkedList.append(7);

        linkedList.insert(4, 50); // 11 3 23 7
        linkedList.printList();
    }
}