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
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (length == 0) return null;
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

// While version
//    public Node get(int index) {
//        if (length == 0) return null;
//        if (index < 0 || index >= length) return null;
//        Node temp = head;
//        int counter = 0;
//        while (temp.next != null) {
//            if (counter == index) {
//                return temp;
//            }
//            temp = temp.next;
//            counter++;
//        }
//        return temp;
//    }

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

    public class Node {
        public int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}