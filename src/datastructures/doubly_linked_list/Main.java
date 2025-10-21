package datastructures.doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(10);
        myDLL.append(15);

        myDLL.removeLast();

        myDLL.printList();
    }
}
