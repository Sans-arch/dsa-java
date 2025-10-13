package datastructures;

import datastructures.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(11);
        linkedList.append(3);
        linkedList.append(23);
        linkedList.append(7);

        System.out.println("removido: " + linkedList.remove(2).value); // 11 3 23 7  --->  3 23 7
        System.out.println();
        linkedList.printList();
    }
}