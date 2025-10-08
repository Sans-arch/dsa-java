package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node node = new Node(value);
        node.next = null;

        head = node;
        tail = node;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        newNode.next = null;
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length = length + 1;
    }

    public Node removeLast() {
        if (length == 0) return null;

        Node temp = head;
        Node pre = head;

        while (temp != null) {
//            System.out.printf("{value: %d, next: %s}\n", temp.value, temp.next);
            if (length == 1) {
                head = null;
                tail = null;
                return pre;
            }

            if (temp.next == null) {
                pre.next = null;
            }

            pre = temp; // 3
            temp = temp.next; // 4
        }

        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;

        head = newNode;
        length = length + 1;
    }

//    public boolean insert(int index, int value) {
//        Node newNode = new Node(value);
//
//        Node temp = head;
//        int counter = 0;
//        while (temp != null) {
//            if (counter == index) {
//                newNode.
//            }
//        }
//    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}