package datastructures.doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.removeLast();
        myDLL.prepend(10);
        myDLL.prepend(20);

        myDLL.printList();
    }
}
