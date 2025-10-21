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

    public boolean set(int index, int value) {
        if (length == 0) return false;
        if (index < 0 || index >= length) return false;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node temp = get(index - 1);
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index > length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node pre = get(index - 1);
        Node temp = pre.next;

        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void removeDuplicates() {
        Node current = head;
        for (int i = 0; i < length; i++) {
            Node runner = current;
            for (int j = 0; j <= length; j++) { // 5 5
                if (current == null) return;
                if (runner == null) {
                    current = current.next;
                    runner = current;
                } else {
                    if (runner.next != null && runner.next.value == current.value) {
                        runner.next = runner.next.next;
                    }
                    if (runner.next == null && runner.value == current.value) {
                        current.next = runner.next;
                    }
                    runner = runner.next;
                }
            }
        }
    }

    public int toBinary() { // 1 1 1 0
        if (head == null) return 0;
        int total = 0;
        Node current = head;

        while(current != null) {
            total = (total * 2) + current.value;
            current = current.next;
        }

        return total;
    }

    public void partitionList(int x) {
        if (head == null) return;
        var d1 = new LinkedList(0);
        var d2 = new LinkedList(0);

        var prev1 = d1.head;
        var prev2 = d2.head;
        var temp = head;

        while (temp.next != null) {
            if (temp.value < x) {
                d1.append(temp.value);
            }
            if (temp.value >= x)  {
                d2.append(temp.value);
            }
            temp = temp.next;
        }

        System.out.println("d1:");
        d1.head = d1.head.next;
        d1.printList();

        System.out.println();
        d2.head = d2.head.next;
        System.out.println("d2:");
        d2.printList();

        System.out.println("d1 current: " + prev1.value);
        System.out.println("d2 current: " + prev2.value);
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