package datastructures.doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.prepend(15);

        myDLL.printList();
    }
}
